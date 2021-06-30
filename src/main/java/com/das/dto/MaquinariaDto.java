package com.das.dto;

import com.das.model.Maquinaria;

public class MaquinariaDto {
	private long idMaquinaria;
	private String nombre;
	private String descripcion;
	private double costoPromedioMensual;
	private int numeroEjemplares;
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
	
	public MaquinariaDto(long idMaquinaria, String nombre, String descripcion, double costoPromedioMensual,
			int numeroEjemplares) {
		super();
		this.idMaquinaria = idMaquinaria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoPromedioMensual = costoPromedioMensual;
		this.numeroEjemplares = numeroEjemplares;
	}
	public static MaquinariaDto toDto(Maquinaria m) {
		return new MaquinariaDto(m.getIdMaquinaria(),m.getNombre(),
				m.getDescripcion(),m.getCostoPromedioMensual(),m.getNumeroEjemplares());
	}
	
	public static Maquinaria toModel(MaquinariaDto m) {
		return new Maquinaria(m.getNombre(),
				m.getDescripcion(),m.getCostoPromedioMensual(),m.getNumeroEjemplares());
	}
}
