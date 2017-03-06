package com.ipartek.formacion.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.repository.DadoDAO;
import com.ipartek.formacion.repository.UsuarioDAO;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired private UsuarioDAO usuarioDAO;
	@Autowired private DadoDAO dadoDAO;

	@Override
	public ArrayList<Usuario> getAll() {		
		return usuarioDAO.getAll();
	}

	@Override
	public ArrayList<Usuario> getAllOrderByTiradas() {
		ArrayList<Usuario> us= usuarioDAO.getAllOrderByTiradas();
		for (Usuario u : us) {
			u.setTiradas(dadoDAO.getLastByUserId(u.getId()));
			u.setNumTiradas(dadoDAO.countById(u.getId()));
		}
		return us;
	}

	@Override
	public Usuario getById(int id) {
		Usuario u = usuarioDAO.getById(id);
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
