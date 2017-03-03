package com.ipartek.formacion.repository;

import java.util.ArrayList;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Historial;

public interface DadoDAO {
	
	void setDataSource(DataSource dataSource);
	
	ArrayList<Historial> getAll();
	
	ArrayList<Dado> getAllByUserId(int idUsuario);
	
	boolean addTirada( int idUsuario);
	
	
}
