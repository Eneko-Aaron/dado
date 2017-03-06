package com.ipartek.formacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.service.UsuarioService;

@Controller()
public class AdminController {
	//private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired()
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String listar( Model model ) {
		
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/crear", method = RequestMethod.GET)
	public String irCrear( Model model ) {
		model.addAttribute("usuario", new Usuario());
		return "admin/form";
	}
	
	@RequestMapping(value = "/admin/modificar/{idUsuario}", method = RequestMethod.GET)
	public String irModificar(@PathVariable() int idUsuario,  Model model ) {
		model.addAttribute("usuario", this.usuarioService.getById(idUsuario) );
		return "admin/form";
	}
	
	@RequestMapping(value = "/admin/eliminar/{idUsuario}", method = RequestMethod.GET)
	public String eliminar(@PathVariable() int idUsuario, Model model ) {		
		this.usuarioService.delete(idUsuario);
		return "admin/index";
	}
}
