package com.das.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Inconveniente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idInconveniente;
	private String motivo;
	private LocalDateTime fecha;
	@ManyToOne
	@JoinColumn(name = "idProyecto")
	private Proyecto proyecto;
	public long getIdInconveniente() {
		return idInconveniente;
	}
	public void setIdInconveniente(long idInconveniente) {
		this.idInconveniente = idInconveniente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public Inconveniente(long idInconveniente, String motivo, LocalDateTime fecha, Proyecto proyecto) {
		super();
		this.idInconveniente = idInconveniente;
		this.motivo = motivo;
		this.fecha = fecha;
		this.proyecto = proyecto;
	}
	public Inconveniente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
