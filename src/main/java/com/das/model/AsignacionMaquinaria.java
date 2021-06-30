package com.das.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AsignacionMaquinaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAsignacionMaquinaria;
	@ManyToOne
	@JoinColumn(name = "idProyecto")
	private Proyecto proyecto;
	@ManyToOne
	@JoinColumn(name = "idMaquinaria")
	private Maquinaria maquinaria;
	private LocalDateTime fechaAsignacion;
	private int cantidad;
	public long getIdAsignacionMaquinaria() {
		return idAsignacionMaquinaria;
	}
	public void setIdAsignacionMaquinaria(long idAsignacionMaquinaria) {
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Maquinaria getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(Maquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}
	public LocalDateTime getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public AsignacionMaquinaria(long idAsignacionMaquinaria, Proyecto proyecto, Maquinaria maquinaria,
			LocalDateTime fechaAsignacion, int cantidad) {
		super();
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
		this.proyecto = proyecto;
		this.maquinaria = maquinaria;
		this.fechaAsignacion = fechaAsignacion;
		this.cantidad = cantidad;
	}
	public AsignacionMaquinaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
