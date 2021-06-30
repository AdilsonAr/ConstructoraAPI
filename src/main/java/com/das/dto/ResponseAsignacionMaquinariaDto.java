package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.AsignacionMaquinaria;

public class ResponseAsignacionMaquinariaDto {
	private long idAsignacionMaquinaria;
	private String proyecto;
	private String maquinaria;
	private LocalDateTime fechaAsignacion;
	private int cantidad;
	public long getIdAsignacionMaquinaria() {
		return idAsignacionMaquinaria;
	}
	public void setIdAsignacionMaquinaria(long idAsignacionMaquinaria) {
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(String maquinaria) {
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
	public ResponseAsignacionMaquinariaDto(long idAsignacionMaquinaria, String proyecto, String maquinaria,
			LocalDateTime fechaAsignacion, int cantidad) {
		super();
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
		this.proyecto = proyecto;
		this.maquinaria = maquinaria;
		this.fechaAsignacion = fechaAsignacion;
		this.cantidad = cantidad;
	}
	
	public static ResponseAsignacionMaquinariaDto toDto(AsignacionMaquinaria a) {
		return new ResponseAsignacionMaquinariaDto(a.getIdAsignacionMaquinaria(), a.getProyecto().getNombre()
				, a.getMaquinaria().getNombre(), a.getFechaAsignacion(), a.getCantidad());
	}
}
