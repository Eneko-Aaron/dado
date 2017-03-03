package com.ipartek.formacion.repository;

import java.util.ArrayList;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Usuario;

public interface UsuarioDAO {
	
	void setDataSource(DataSource dataSource);
	
	ArrayList<Usuario> getAll();
	
	ArrayList<Usuario> getAllOrderByTiradas();
	
	Usuario getById( int id );
	
	boolean add( Usuario u );
	
	boolean update( Usuario u );
	
	boolean delete ( int id );
	
	int count();
	
	boolean darDeAlta(int id);
	
	boolean darDeBaja(int id);
}
