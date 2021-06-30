package com.das.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//single responsibility principle
//cada entidad tiene una clase para definir el modelo de los datos
@Entity
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAcceso;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "idProyecto")
	private Proyecto proyecto;
	public long getIdAcceso() {
		return idAcceso;
	}
	public void setIdAcceso(long idAcceso) {
		this.idAcceso = idAcceso;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Acceso(Usuario usuario, Proyecto proyecto) {
		super();
		this.usuario = usuario;
		this.proyecto = proyecto;
	}
	public Acceso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
