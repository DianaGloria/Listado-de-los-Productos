package com.nfm.springboot.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nfm.springboot.app.model.Articulo;

@Controller
@RequestMapping ("/app")
public class indexController {
	@GetMapping ({"/index", "/", "/home", "", "casa"})
	public String index(Model model){
		model.addAttribute("titulo", "Hola Spring Framework");
		
		return "index";
	}

	@RequestMapping ("/perfil")
	public String perfil(Model model) {
		Articulo articulo =new Articulo();
		articulo.setDescripcion("Refresco de piña");
		model.addAttribute("articulo", articulo);
		model.addAttribute("titulo", "Perfil de usuario:".concat(articulo.getDescripcion()));
		return "perfil";
	}
	@RequestMapping ("/tabla")
	public String tabla (Model model) {
		
		model.addAttribute("titulo", "Listado de Articulos");
		return "tabla";
	}
	@ModelAttribute("articulos")
	public List<Articulo> poblarArticulos(){
		List<Articulo> articulos = Arrays.asList(new Articulo("Mayonesa", "$ 27:99", "Mccormick"),
				new Articulo("Azucar 500 gr", "$ 43:23", "Zulka"),
				new Articulo("Leche 1 Litro", "$ 29:00", "Lala"),
				new Articulo("Galletas Chocolate 60g", "$ 12:00", "Chokis"),
				new Articulo("Six Cerveza", "$ 150:00", "Corona"),
				new Articulo("Frijol Bayo Crudo 1kg", "$ 21:28", "Puritano"),
				new Articulo("Mini Takis Fuego", "$ 16:10", "Barcel"),
				new Articulo("Concentrado de agua de piña", "$ 10:00", "ninguno"),
				new Articulo("Horchata ", "$ 36:00", "Deliciosa"));
		
				return articulos;
	}
}
