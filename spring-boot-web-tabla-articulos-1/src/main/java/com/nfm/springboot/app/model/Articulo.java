package com.nfm.springboot.app.model;

public class Articulo {
	private String descripcion;
	private String precio;
	private String marca;

	public Articulo(String descripcion, String precio, String marca) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	public Articulo() {
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
