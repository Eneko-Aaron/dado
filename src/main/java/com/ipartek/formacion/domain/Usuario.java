package com.ipartek.formacion.domain;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	private int id;
	private String nombre;
	
	private Date fechaAlta;
	private	Date fechaBaja;
	private Date fechaModificacion;
	
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
		return fechaAlta;
	}


	public void setFecha_alta(Date fecha_alta) {
		this.fechaAlta = fecha_alta;
	}


	public Date getFecha_baja() {
		return fechaBaja;
	}


	public void setFecha_baja(Date fecha_baja) {
		this.fechaBaja = fecha_baja;
	}


	public Date getFecha_modificacion() {
		return fechaModificacion;
	}


	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fechaModificacion = fecha_modificacion;
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
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fecha_alta=" + fechaAlta + ", fecha_baja=" + fechaBaja
				+ ", fecha_modificacion=" + fechaModificacion + ", tiradas=" + tiradas + ", numTiradas=" + numTiradas
				+ "]";
	}

	
	
	

	
	
	
}
