package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.AsignacionMaquinaria;
import com.das.model.Maquinaria;
import com.das.model.Proyecto;

public class AsignacionMaquinariaDto {
	private long idAsignacionMaquinaria;
	private long proyecto;
	private long maquinaria;
	private LocalDateTime fechaAsignacion;
	private int cantidad;
	public long getIdAsignacionMaquinaria() {
		return idAsignacionMaquinaria;
	}
	public void setIdAsignacionMaquinaria(long idAsignacionMaquinaria) {
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
	}
	public long getProyecto() {
		return proyecto;
	}
	public void setProyecto(long proyecto) {
		this.proyecto = proyecto;
	}
	public long getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(long maquinaria) {
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
	public AsignacionMaquinariaDto(long idAsignacionMaquinaria, long proyecto, long maquinaria,
			LocalDateTime fechaAsignacion, int cantidad) {
		super();
		this.idAsignacionMaquinaria = idAsignacionMaquinaria;
		this.proyecto = proyecto;
		this.maquinaria = maquinaria;
		this.fechaAsignacion = fechaAsignacion;
		this.cantidad = cantidad;
	}
	
	public static AsignacionMaquinaria toModel(AsignacionMaquinariaDto a) {
		Proyecto p=new Proyecto();
		p.setIdProyecto(a.getProyecto());
		Maquinaria m=new Maquinaria();
		m.setIdMaquinaria(a.getMaquinaria());
		return new AsignacionMaquinaria(a.getIdAsignacionMaquinaria(), p, m, a.getFechaAsignacion(), a.getCantidad());
	}
}
