package com.ipartek.formacion.repository;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.repository.mapper.UsuarioConTiradasMapper;
import com.ipartek.formacion.repository.mapper.UsuarioMapper;

@Repository("usuarioDAO")
public class UsuarioDAOImpl implements UsuarioDAO {

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
	public ArrayList<Usuario> getAll() {
		ArrayList<Usuario> us= (ArrayList<Usuario>) this.jdbctemplate.query(
				"SELECT `id`, `nombre` FROM usuario ORDER BY `id` DESC;", 
				new UsuarioMapper());
		return us;
	}

	@Override
	public ArrayList<Usuario> getAllOrderByTiradas() {
		ArrayList<Usuario> us= (ArrayList<Usuario>) this.jdbctemplate.query(
				"SELECT u.id, u.nombre , count(u.id) as total FROM usuario as u, tirada as t WHERE u.id = t.id_usuario GROUP BY u.id ORDER BY total DESC;",
				new UsuarioConTiradasMapper());
		return us;
	}

	@Override
	public Usuario getById(int id) {
		Usuario u = this.jdbctemplate.queryForObject(
				"SELECT `id`, `nombre` FROM usuario WHERE `id`= ?",
				new Object[]{id}, 
				new UsuarioMapper());
		return u;
	}

	@Override
	public boolean add(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int count() {
		int contador = 0;
		try{
			contador=this.jdbctemplate.queryForInt(
					"SELECT COUNT(`id`) as 'total' FROM `usuario`");
			
		}catch(Exception e){
			
		}
		return contador;
	}
	
}
