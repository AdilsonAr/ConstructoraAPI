package com.das.dto;

import com.das.model.Acceso;

public class AccesoDto {
	private long id;
	private String proyecto;
	private String usuario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public AccesoDto(long id, String proyecto, String usuario) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.usuario = usuario;
	}
	
	public static AccesoDto toDto(Acceso a) {
		return new AccesoDto(a.getIdAcceso(), a.getProyecto().getNombre(), a.getUsuario().getUsuario());
	}
	
}
