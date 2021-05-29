package com.das.dto;

import com.das.model.Proyecto;

public class RequestUpdateProyectoDto extends RequestProyectoDto{
	private long idProyecto;
	private double porcentajeAvance;
	private String estadoAvance;
	
	public long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		this.idProyecto = idProyecto;
	}
	public double getPorcentajeAvance() {
		return porcentajeAvance;
	}
	public void setPorcentajeAvance(double porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}
	public String getEstadoAvance() {
		return estadoAvance;
	}
	public void setEstadoAvance(String estadoAvance) {
		this.estadoAvance = estadoAvance;
	}
	public static Proyecto toModel(RequestUpdateProyectoDto p) {
		return new Proyecto(p.getIdProyecto(), p.getNombre(),p.getLatitud(),
				p.getLongitud(),p.getPorcentajeAvance(),p.getInicio(),p.getFin());
	}
}
