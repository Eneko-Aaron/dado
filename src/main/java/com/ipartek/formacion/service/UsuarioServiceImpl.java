package com.ipartek.formacion.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.repository.DadoDAO;
import com.ipartek.formacion.repository.UsuarioDAO;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired UsuarioDAO usuarioDAO;
	@Autowired DadoDAO dadoDAO;

	@Override
	public ArrayList<Usuario> getAll() {		
		return usuarioDAO.getAll();
	}

	@Override
	public ArrayList<Usuario> getAllOrderByTiradas() {
		return usuarioDAO.getAllOrderByTiradas();
	}

	@Override
	public Usuario getById(int id) {
		Usuario u = usuarioDAO.getById(id);
		u.setTiradas(dadoDAO.getAllByUserId(id));
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
	public boolean darDeAlta(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean darDeBaja(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int count() {
		return usuarioDAO.count();
	}

}
