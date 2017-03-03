package com.ipartek.formacion.service;

import java.util.ArrayList;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Historial;

public interface DadoService {
	ArrayList<Historial> getHistorial();
	
	ArrayList<Dado> getAllByUserId(int idUsuario);
	
	boolean addTirada( int idUsuario);

}
