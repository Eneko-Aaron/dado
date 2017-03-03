package com.ipartek.formacion.repository;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Historial;
import com.ipartek.formacion.repository.mapper.DadoMapper;
import com.ipartek.formacion.repository.mapper.HistorialMapper;

@Repository("dadoDAO")
public class DadoDAOImpl implements DadoDAO {

	
	@Autowired
	private DataSource dataSource;	
	private JdbcTemplate jdbctemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbctemplate = new JdbcTemplate(this.dataSource);

	}
	
	@Override
	public ArrayList<Historial> getHistorial() {
		ArrayList<Historial> hs= (ArrayList<Historial>) this.jdbctemplate.query(
				"SELECT u.id, u.nombre, t.fecha FROM tirada as t, usuario as u ORDER BY t.fecha;", 
				new HistorialMapper());
		return hs;
	}

	@Override
	public ArrayList<Dado> getAllByUserId(int idUsuario) {
		ArrayList<Dado> ds= (ArrayList<Dado>) this.jdbctemplate.query(
				"SELECT `id`, `id_usuario`, `fecha` FROM `tirada` WHERE `id_usuario`= ?", 
				new Object[]{idUsuario},
				new DadoMapper());
		return ds;
	}

	@Override
	public boolean addTirada(int idUsuario) {
		int lineasInsertadas= 0;
		lineasInsertadas= this.jdbctemplate.update(
				"INSERT INTO `tirada` (`id_usuario` ) values ( ? );", idUsuario);
		return (lineasInsertadas!=0)? true: false;
	}
		

	

}
