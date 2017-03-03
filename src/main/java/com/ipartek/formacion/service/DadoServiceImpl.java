package com.ipartek.formacion.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Historial;
import com.ipartek.formacion.repository.DadoDAO;

@Service("dadoService")
public class DadoServiceImpl implements DadoService {

	@Autowired
	private DadoDAO dadoDAO;
	
	@Override
	public ArrayList<Historial> getHistorial() {
		return dadoDAO.getHistorial();
	}

	@Override
	public ArrayList<Dado> getAllByUserId(int idUsuario) {
		return dadoDAO.getAllByUserId(idUsuario);
	}

	@Override
	public boolean addTirada(int idUsuario) {
		return dadoDAO.addTirada(idUsuario);
	}

}
