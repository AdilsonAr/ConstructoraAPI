package com.das.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Suscripcion> suscripciones;
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
	private List<Acceso> accesos;
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List<Suscripcion> getSuscripciones() {
		return suscripciones;
	}
	public void setSuscripciones(List<Suscripcion> suscripciones) {
		this.suscripciones = suscripciones;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Acceso> getAccesos() {
		return accesos;
	}
	public void setAccesos(List<Acceso> accesos) {
		this.accesos = accesos;
	}
	public Usuario(List<Suscripcion> suscripciones, Role role, List<Acceso> accesos) {
		super();
		this.suscripciones = suscripciones;
		this.role = role;
		this.accesos = accesos;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
