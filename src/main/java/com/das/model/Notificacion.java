package com.das.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Notificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNotificacion;
	@OneToOne(mappedBy = "notificacion")
	private NotificacionNoVista notificacionNoVista;
	@ManyToOne
	@JoinColumn(name="idCanal")
	private Canal canal;
	private String conenido;
	private LocalDateTime fecha;
	public long getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(long idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	public String getConenido() {
		return conenido;
	}
	public void setConenido(String conenido) {
		this.conenido = conenido;
	}
	public LocalDateTime getDateTime() {
		return fecha;
	}
	public void setDateTime(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Notificacion(Canal canal, String conenido, LocalDateTime dateTime) {
		super();
		this.canal = canal;
		this.conenido = conenido;
		this.fecha = dateTime;
	}
	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
