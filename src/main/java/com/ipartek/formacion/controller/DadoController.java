package com.ipartek.formacion.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.formacion.domain.Dado;
import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.service.DadoService;
import com.ipartek.formacion.service.UsuarioService;
@Controller
public class DadoController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private DadoService dadoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("ranking", usuarioService.getAllOrderByTiradas());
		return "home";
	}
	

	@RequestMapping(value = "/lanzar", method = RequestMethod.GET)
	public String dado(Model model) {

		Dado d = new Dado();
		Usuario u = new Usuario();

		d.lanzar(usuarioService.count());
		dadoService.addTirada(d.getNumero());
		u = usuarioService.getById(d.getNumero());
		
		model.addAttribute("usuario", u);
		model.addAttribute("ranking", usuarioService.getAllOrderByTiradas());
		return "home";
	}
	
	@RequestMapping(value = "/estadisticas", method = RequestMethod.GET)
	public String estadisticas(Model model) {
		
		model.addAttribute("historial", dadoService.getHistorial());
		return "estadisticas";
	}
	
	@RequestMapping(value = "/admin/gestion", method = RequestMethod.GET)
	public String gestion(Model model) {
		
		model.addAttribute("usuarios", usuarioService.getAll());
		return "estadisticas";
	}
}
