package com.ipartek.formacion.service;

import java.util.ArrayList;

import com.ipartek.formacion.domain.Usuario;

public interface UsuarioService {
	
	ArrayList<Usuario> getAll();
	
	ArrayList<Usuario> getAllOrderByTiradas();
	
	Usuario getById( int id );
	
	boolean add( Usuario u );
	
	boolean update( Usuario u );
	
	boolean delete ( int id );
	
	boolean darDeAlta(Usuario u);
	
	boolean darDeBaja(Usuario u);
	
	int count();
	
	

}
