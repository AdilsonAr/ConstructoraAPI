package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.Inconveniente;

public class ItemInconvenienteDto {
	private long idInconveniente;
	private String motivo;
	private LocalDateTime fecha;
	private String proyecto;
	public long getIdInconveniente() {
		return idInconveniente;
	}
	public void setIdInconveniente(long idInconveniente) {
		this.idInconveniente = idInconveniente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public ItemInconvenienteDto(long idInconveniente, String motivo, LocalDateTime fecha, String proyecto) {
		super();
		this.idInconveniente = idInconveniente;
		this.motivo = motivo;
		this.fecha = fecha;
		this.proyecto = proyecto;
	}
	public static ItemInconvenienteDto toDto(Inconveniente i) {
		return new ItemInconvenienteDto(i.getIdInconveniente(), i.getMotivo(),
				i.getFecha(), i.getProyecto().getNombre());
	}
}
