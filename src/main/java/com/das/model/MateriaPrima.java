package com.das.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MateriaPrima {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMateriaPrima;
	private String nombre;
	private String descripcion;
	private double costoPromedio;
	private int cantidadExistencias;
	@OneToMany(mappedBy = "materia_prima")
	private List<AsignacionMateriaPrima> asignacionMateriaPrimas;
	public long getIdMateriaPrima() {
		return idMateriaPrima;
	}
	public void setIdMateriaPrima(long idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCostoPromedio() {
		return costoPromedio;
	}
	public void setCostoPromedio(double costoPromedio) {
		this.costoPromedio = costoPromedio;
	}
	public int getCantidadExistencias() {
		return cantidadExistencias;
	}
	public void setCantidadExistencias(int cantidadExistencias) {
		this.cantidadExistencias = cantidadExistencias;
	}
	public List<AsignacionMateriaPrima> getAsignacionMateriaPrimas() {
		return asignacionMateriaPrimas;
	}
	public void setAsignacionMateriaPrimas(List<AsignacionMateriaPrima> asignacionMateriaPrimas) {
		this.asignacionMateriaPrimas = asignacionMateriaPrimas;
	}
	public MateriaPrima(String nombre, String descripcion, double costoPromedio, int cantidadExistencias,
			List<AsignacionMateriaPrima> asignacionMateriaPrimas) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoPromedio = costoPromedio;
		this.cantidadExistencias = cantidadExistencias;
		this.asignacionMateriaPrimas = asignacionMateriaPrimas;
	}
	public MateriaPrima() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
