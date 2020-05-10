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
		List<Articulo> articulos = Arrays.asList(new Articulo("Mayonesa", "$ 27:99", "Mccormick", "12pz", "La Costeña"),
				new Articulo("Azucar 500 gr", "$ 43:23", "Zulka", "30pz", "Zulkarmex"),
				new Articulo("Leche 1 Litro", "$ 29:00", "Lala", "12pz", "Alpura"),
				new Articulo("Galletas Chocolate 60g", "$ 12:00", "Chokis", "24pz", "Gamesa"),
				new Articulo("Six Cerveza", "$ 150:00", "Corona", "8pz", "Modelo"),
				new Articulo("Frijol Bayo Crudo 1kg", "$ 21:28", "Puritano", "6pz", "El puritano"),
				new Articulo("Mini Takis Fuego", "$ 16:10", "Barcel", "1pack", "Barcel"),
				new Articulo("Concentrado de agua de piña", "$ 10:00", "ninguno", "5pz", "ninguno"),
				new Articulo("Horchata ", "$ 36:00", "Deliciosa", "8pz", "Proalmex"));
		
				return articulos;
	}
}
