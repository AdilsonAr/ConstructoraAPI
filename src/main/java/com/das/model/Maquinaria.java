package com.das.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Maquinaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMaquinaria;
	private String nombre;
	private String descripcion;
	private double costoPromedioMensual;
	private int numeroEjemplares;
	@OneToMany
	@JoinColumn(name="idAsignacionMaquinaria")
	private List<AsignacionMaquinaria> asignacionMaquinaria;
	public long getIdMaquinaria() {
		return idMaquinaria;
	}
	public void setIdMaquinaria(long idMaquinaria) {
		this.idMaquinaria = idMaquinaria;
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
	public double getCostoPromedioMensual() {
		return costoPromedioMensual;
	}
	public void setCostoPromedioMensual(double costoPromedioMensual) {
		this.costoPromedioMensual = costoPromedioMensual;
	}
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}
	public List<AsignacionMaquinaria> getAsignacionMaquinaria() {
		return asignacionMaquinaria;
	}
	public void setAsignacionMaquinaria(List<AsignacionMaquinaria> asignacionMaquinaria) {
		this.asignacionMaquinaria = asignacionMaquinaria;
	}
	public Maquinaria(String nombre, String descripcion, double costoPromedioMensual, int numeroEjemplares,
			List<AsignacionMaquinaria> asignacionMaquinaria) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoPromedioMensual = costoPromedioMensual;
		this.numeroEjemplares = numeroEjemplares;
		this.asignacionMaquinaria = asignacionMaquinaria;
	}
	public Maquinaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
