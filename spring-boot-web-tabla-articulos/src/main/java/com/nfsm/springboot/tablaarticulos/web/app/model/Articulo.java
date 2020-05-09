package com.nfsm.springboot.tablaarticulos.web.app.model;

public class Articulo {

	private String descripcion;

	public Articulo(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Articulo() {
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
