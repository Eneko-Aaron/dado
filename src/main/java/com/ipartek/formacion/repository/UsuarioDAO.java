package com.ipartek.formacion.repository;

import java.util.List;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Usuario;

public interface UsuarioDAO {
	
	void setDataSource(DataSource dataSource);
	
	List<Usuario> getAll();
	
	List<Usuario> getAllOrderByTiradas();
	
	Usuario getById( int idUsuario );
	
	boolean add( Usuario usuario );
	
	boolean update( Usuario usuario );
	
	boolean delete ( int idUsuario );
	
	int count();
	
	boolean darDeAlta(int idUsuario);
	
	boolean darDeBaja(int idUsuario);
}
