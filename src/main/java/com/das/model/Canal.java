package com.das.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.das.configuration.SpringContext;
import com.das.service.Observable;
import com.das.service.Observer;
import com.das.service.SuscripcionService;

@Entity
public class Canal implements Observable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCanal;
	private String nombre;
	@OneToMany(mappedBy = "canal", cascade = CascadeType.ALL)
	private List<Notificacion> notificaciones;
	@OneToMany(mappedBy = "idSuscripcion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
	public Canal(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Canal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void myNotify(Notificacion n) {
		SuscripcionService susService=SpringContext.getBean(SuscripcionService.class);
		(susService.readCanal(this)).forEach(x->x.getUsuario().update(n));
	}
	@Override
	public void attach(Observer observer) {
		SuscripcionService susService=SpringContext.getBean(SuscripcionService.class);
		susService.create(new Suscripcion((Usuario)observer, this));
	}
	@Override
	public void detach(Observer o) {
		
	}
	
}
