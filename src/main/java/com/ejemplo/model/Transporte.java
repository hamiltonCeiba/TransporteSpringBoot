package com.ejemplo.model;

public class Transporte {

	private int id;
	private String nombre;
	private String descripcion;
	private String urlImg;
	
	public Transporte() {
		
	}
	
	public Transporte(int id, String nombre, String descripcion, String urlImg) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
	
}
