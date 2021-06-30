package com.das.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class NotificacionNoVista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNotificacionesNoVistas;
	@OneToOne
	@JoinColumn(name = "idNotificacion")
	private Notificacion notificacion;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	public long getIdNotificacionesNoVistas() {
		return idNotificacionesNoVistas;
	}
	public void setIdNotificacionesNoVistas(long idNotificacionesNoVistas) {
		this.idNotificacionesNoVistas = idNotificacionesNoVistas;
	}
	public Notificacion getNotificacion() {
		return notificacion;
	}
	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public NotificacionNoVista(Notificacion notificacion, Usuario usuario) {
		super();
		this.notificacion = notificacion;
		this.usuario = usuario;
	}
	public NotificacionNoVista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
