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

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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
