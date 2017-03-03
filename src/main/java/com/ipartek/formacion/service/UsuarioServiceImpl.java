package com.ipartek.formacion.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Dado;
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
		ArrayList<Dado> tiradas= dadoDAO.getAllByUserId(id);
		u.setTiradas(tiradas);
		u.setNumTiradas(tiradas.size());
		return u;
	}

	@Override
	public boolean add(Usuario u) {
		return usuarioDAO.add(u);
	}

	@Override
	public boolean update(Usuario u) {
		return usuarioDAO.update(u);
	}

	@Override
	public boolean delete(int id) {
		return usuarioDAO.delete(id);
	}

	@Override
	public boolean darDeAlta(int id) {
		return usuarioDAO.darDeAlta(id);
	}

	@Override
	public boolean darDeBaja(int id) {
		return usuarioDAO.darDeBaja(id);
	}

	@Override
	public int count() {
		return usuarioDAO.count();
	}

}
