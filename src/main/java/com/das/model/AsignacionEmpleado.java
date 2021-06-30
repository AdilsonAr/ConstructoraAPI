package com.das.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AsignacionEmpleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAsignacionEmpleado;
	private LocalDateTime fecha;
	private String estado;
	@ManyToOne
	@JoinColumn(name="idProyecto")
	private Proyecto proyecto;
	@ManyToOne
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;
	public long getIdAsignacionEmpleado() {
		return idAsignacionEmpleado;
	}
	public void setIdAsignacionEmpleado(long idAsignacionEmpleado) {
		this.idAsignacionEmpleado = idAsignacionEmpleado;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public AsignacionEmpleado(long idAsignacionEmpleado, LocalDateTime fecha, String estado, Proyecto proyecto,
			Empleado empleado) {
		super();
		this.idAsignacionEmpleado = idAsignacionEmpleado;
		this.fecha = fecha;
		this.estado = estado;
		this.proyecto = proyecto;
		this.empleado = empleado;
	}
	public AsignacionEmpleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
