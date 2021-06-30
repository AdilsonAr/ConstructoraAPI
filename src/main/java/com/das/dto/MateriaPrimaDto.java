package com.das.dto;

import com.das.model.MateriaPrima;

public class MateriaPrimaDto {
	private long idMateriaPrima;
	private String nombre;
	private String descripcion;
	private double costoPromedio;
	private int cantidadExistencias;
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
	public MateriaPrimaDto(long idMateriaPrima, String nombre, String descripcion, double costoPromedio,
			int cantidadExistencias) {
		super();
		this.idMateriaPrima = idMateriaPrima;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoPromedio = costoPromedio;
		this.cantidadExistencias = cantidadExistencias;
	}
	
	public static MateriaPrima toModel(MateriaPrimaDto m) {
		return new MateriaPrima(m.getNombre(),m.getDescripcion()
				,m.getCostoPromedio(),m.getCantidadExistencias());
	}
	
	public static MateriaPrimaDto toDto(MateriaPrima m) {
		return new MateriaPrimaDto(m.getIdMateriaPrima(), m.getNombre(),
				m.getDescripcion(), m.getCostoPromedio(), m.getCantidadExistencias());
	}
}
