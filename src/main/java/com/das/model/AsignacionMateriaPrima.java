package com.das.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AsignacionMateriaPrima {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAsignacionMateriaPrima;
	private LocalDateTime fecha;
	private int cantidad;
	@ManyToOne
	@JoinColumn(name="idProyecto")
	private Proyecto proyecto;
	@ManyToOne
	@JoinColumn(name="idMateriaPrima")
	private MateriaPrima materiaPrima;
	public long getIdAsignacionMateriaPrima() {
		return idAsignacionMateriaPrima;
	}
	public void setIdAsignacionMateriaPrima(long idAsignacionMateriaPrima) {
		this.idAsignacionMateriaPrima = idAsignacionMateriaPrima;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public AsignacionMateriaPrima(LocalDateTime fecha, int cantidad, Proyecto proyecto, MateriaPrima materiaPrima) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.proyecto = proyecto;
		this.materiaPrima = materiaPrima;
	}
	public AsignacionMateriaPrima() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
