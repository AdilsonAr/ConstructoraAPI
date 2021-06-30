package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.AsignacionMateriaPrima;

public class ResponseAsignacionMateriaPrimaDto {
	private long idAsignacionMateriaPrima;
	private LocalDateTime fecha;
	private int cantidad;
	private String proyecto;
	private String materiaPrima;
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
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public ResponseAsignacionMateriaPrimaDto(long idAsignacionMateriaPrima, LocalDateTime fecha, int cantidad,
			String proyecto, String materiaPrima) {
		super();
		this.idAsignacionMateriaPrima = idAsignacionMateriaPrima;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.proyecto = proyecto;
		this.materiaPrima = materiaPrima;
	}
	public static ResponseAsignacionMateriaPrimaDto toDto(AsignacionMateriaPrima a) {
		return new ResponseAsignacionMateriaPrimaDto(a.getIdAsignacionMateriaPrima()
				, a.getFecha(), a.getCantidad(), a.getProyecto().getNombre()
				, a.getMateriaPrima().getNombre());
	}
}
