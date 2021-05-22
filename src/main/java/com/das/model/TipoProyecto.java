package com.das.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TipoProyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTipoProyecto;
	private String tipo;
	public long getIdTipoProyecto() {
		return idTipoProyecto;
	}
	public void setIdTipoProyecto(long idTipoProyecto) {
		this.idTipoProyecto = idTipoProyecto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TipoProyecto(String tipo) {
		super();
		this.tipo = tipo;
	}
	public TipoProyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
