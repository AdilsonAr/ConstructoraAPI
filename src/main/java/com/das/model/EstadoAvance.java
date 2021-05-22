package com.das.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstadoAvance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEstadoAvance;
	private String estado;
	public long getIdEstadoAvance() {
		return idEstadoAvance;
	}
	public void setIdEstadoAvance(long idEstadoAvance) {
		this.idEstadoAvance = idEstadoAvance;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public EstadoAvance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstadoAvance(String estado) {
		super();
		this.estado = estado;
	}
	
}
