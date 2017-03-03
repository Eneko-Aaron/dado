package com.ipartek.formacion.domain;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	private int id;
	private String nombre;
	
	private Date fecha_alta;
	private	Date fecha_baja;
	private Date fecha_modificacion;
	
	private ArrayList<Dado> tiradas;
	private int numTiradas;
	
	//constructor
	public Usuario() {
		super();
		this.id= -1;
		this.nombre= "";
		
	}

	//getter & setter
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


	public Date getFecha_alta() {
		return fecha_alta;
	}


	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}


	public Date getFecha_baja() {
		return fecha_baja;
	}


	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}


	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}


	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public ArrayList<Dado> getTiradas() {
		return tiradas;
	}

	public void setTiradas(ArrayList<Dado> tiradas) {
		this.tiradas = tiradas;
	}

	public int getNumTiradas() {
		return numTiradas;
	}

	public void setNumTiradas(int numTiradas) {
		this.numTiradas = numTiradas;
	}

	//toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja
				+ ", fecha_modificacion=" + fecha_modificacion + ", tiradas=" + tiradas + "]";
	}

	

	
	
	
}
