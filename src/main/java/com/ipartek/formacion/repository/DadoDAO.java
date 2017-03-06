package com.ipartek.formacion.repository;

import java.util.ArrayList;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Historial;

public interface DadoDAO {
	
	void setDataSource(DataSource dataSource);
	
	ArrayList<Historial> getHistorial();
	
	ArrayList<Dado> getAllByUserId(int idUsuario);
	
	ArrayList<Dado> getLastByUserId(int idUsuario);
	
	boolean addTirada( int idUsuario);
	
	int countById(int idUsuario);
	
	int countAll();
	
	
	
	
}
