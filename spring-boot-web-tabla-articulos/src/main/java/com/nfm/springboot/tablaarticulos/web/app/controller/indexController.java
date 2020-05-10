package com.nfm.springboot.tablaarticulos.web.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nfsm.springboot.tablaarticulos.web.app.model.Articulo;

@Controller
@RequestMapping ("/app")
public class indexController {

	@GetMapping ({"/index", "/", "/home", "", "casa"})
	public String index(Model model){
		model.addAttribute("Titulo", "Hola Spring Framework");
		
		return "index";
	}

	@RequestMapping ("/perfil")
	public String perfil(Model model) {
		Articulo articulo=new Articulo();
		articulo.setDescripcion("Mayonesa");
		model.addAttribute("articulo", articulo);
		model.addAttribute("titulo", "Perfil de articulo:".concat(articulo.getDescripcion()));
		return "perfil";
	}
	@RequestMapping ("/listar")
	public String listar (Model model) {
		
		model.addAttribute("titulo", "Listado de Articulos");
		return"listar";
	}
	@ModelAttribute("articulos")
	public List<Articulo> poblarArticulos(){
		List<Articulo> articulos = Arrays.asList(new Articulo("Mayonesa"),
				new Articulo("Azucar 500 gr"),
				new Articulo("Leche 1 Litro"),
				new Articulo("Galletas Chocolate 60g"),
				new Articulo("Six Cerveza"),
				new Articulo("Frijol Bayo Crudo 1kg"),
				new Articulo("Mini Takis Fuego"),
				new Articulo("Concentrado de agua de piña"),
				new Articulo("Six Cerveza"));
		
				return articulos;
	}
}

