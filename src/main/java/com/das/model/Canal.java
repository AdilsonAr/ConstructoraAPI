package com.das.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Canal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCanal;
	private String nombre;
	@OneToMany(mappedBy = "canal", cascade = CascadeType.ALL)
	private List<Notificacion> notificaciones;
	@OneToMany(mappedBy = "idSuscripcion", cascade = CascadeType.ALL)
	private List<Suscripcion> suscripciones;
	public long getIdCanal() {
		return idCanal;
	}
	public void setIdCanal(long idCanal) {
		this.idCanal = idCanal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(List<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	public List<Suscripcion> getSuscripciones() {
		return suscripciones;
	}
	public void setSuscripciones(List<Suscripcion> suscripciones) {
		this.suscripciones = suscripciones;
	}
	public Canal(String nombre, List<Notificacion> notificaciones, List<Suscripcion> suscripciones) {
		super();
		this.nombre = nombre;
		this.notificaciones = notificaciones;
		this.suscripciones = suscripciones;
	}
	public Canal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
