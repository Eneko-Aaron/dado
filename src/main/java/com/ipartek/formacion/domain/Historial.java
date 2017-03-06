package com.ipartek.formacion.domain;

import java.util.Date;

public class Historial {
	private Usuario u;
	private Date fecha;
	public Historial() {
		super();
	}
	public Usuario getU() {
		return u;
	}
	public void setU(Usuario u) {
		this.u = u;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Historial [u=" + u.getNombre() + ", fecha=" + fecha + "]";
	}
	

}
