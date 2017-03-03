package com.ipartek.formacion.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
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
	public boolean add(final Usuario u) {
		boolean insertado = false;
		int lineasInsertadas= 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		lineasInsertadas= this.jdbctemplate.update(
		    new PreparedStatementCreator() {		    	
		        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		            PreparedStatement ps = connection.prepareStatement("INSERT INTO `usuario` (`nombre`) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
		            ps.setString(1, u.getNombre());
		            return ps;
		        }
		    },
		    keyHolder);
		if (lineasInsertadas!=0) {
			insertado=true;
			u.setId(keyHolder.getKey().intValue());
		}
		
		return insertado;
	}

	@Override
	public boolean update(Usuario u) {
		boolean modificado = false;
		int lineasModificadas = 0;
			lineasModificadas = this.jdbctemplate.update("UPDATE `usuario` SET `nombre`= ?", u.getNombre());
			if (lineasModificadas != 0) {
				modificado = true;
			}
		return modificado;
	}

	@Override
	public boolean delete(int id) {
		boolean borrado = false;
		int lineasBorradas = 0;
		lineasBorradas = this.jdbctemplate.update("DELETE FROM `usuario` WHERE `id`= ? ;", id);
		if (lineasBorradas!=0) {
			borrado= true;
		}
		return borrado;
	}

	@Override
	public int count() {
		int	c=this.jdbctemplate.queryForInt(
					"SELECT COUNT(`id`) as 'total' FROM `usuario`");
			
		return c;
	}

	@Override
	public boolean darDeAlta(int id) {
		boolean modificado = false;
		int lineasModificadas = 0;
			lineasModificadas = this.jdbctemplate.update(
					"UPDATE `usuario` SET `fecha_alta`= CURRENT_TIMESTAMP, `fecha_baja`=NULL WHERE `id`= ? ;",
					id);
			if (lineasModificadas != 0) {
				modificado = true;
			}
		return modificado;
	}

	@Override
	public boolean darDeBaja(int id) {
		boolean modificado = false;
		int lineasModificadas = 0;
			lineasModificadas = this.jdbctemplate.update(
					"UPDATE `usuario` SET `fecha_baja`= CURRENT_TIMESTAMP, `fecha_alta`=NULL WHERE `id`= ? ;",
					id);
			if (lineasModificadas != 0) {
				modificado = true;
			}
		return modificado;
	}
	
}
