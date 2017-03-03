package com.ipartek.formacion.domain;

import java.util.Date;

public class Dado {
	private int id;
	private int numero;
	private Date fecha;
	
	//constructor
	public Dado() {
		super();
		
	}
	
	//Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	//toString
	@Override
	public String toString() {
		return "Dado [id=" + id + ", numero=" + numero + ", fecha=" + fecha + "]";
	}
	
	public void lanzar(int numUsuarios){
		this.numero= 1 +(int)(Math.random()*numUsuarios);
	}
	
	
}
