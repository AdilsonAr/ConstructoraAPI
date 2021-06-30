package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.AsignacionMateriaPrima;
import com.das.model.MateriaPrima;
import com.das.model.Proyecto;

public class AsignacionMateriaPrimaDto {
	private long idAsignacionMateriaPrima;
	private LocalDateTime fecha;
	private int cantidad;
	private long proyecto;
	private long materiaPrima;
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
	public long getProyecto() {
		return proyecto;
	}
	public void setProyecto(long proyecto) {
		this.proyecto = proyecto;
	}
	public long getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(long materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public AsignacionMateriaPrimaDto(long idAsignacionMateriaPrima, LocalDateTime fecha, 
			int cantidad, long proyecto,
			long materiaPrima) {
		super();
		this.idAsignacionMateriaPrima = idAsignacionMateriaPrima;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.proyecto = proyecto;
		this.materiaPrima = materiaPrima;
	}
	public static AsignacionMateriaPrima toModel(AsignacionMateriaPrimaDto a) {
		Proyecto p =new Proyecto();
		p.setIdProyecto(a.getProyecto());
		MateriaPrima m=new MateriaPrima();
		m.setIdMateriaPrima(a.getMateriaPrima());
		return new AsignacionMateriaPrima(a.getIdAsignacionMateriaPrima()
				, a.getFecha(), a.getCantidad(), p, m);
	}
}
