package com.das.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Suscripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSuscripcion;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="idCanal")
	private Canal canal;
	public long getIdSuscripcion() {
		return idSuscripcion;
	}
	public void setIdSuscripcion(long idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	public Suscripcion(Usuario usuario, Canal canal) {
		super();
		this.usuario = usuario;
		this.canal = canal;
	}
	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
