package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.Inconveniente;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseInconvenienteDto {
	private long idInconveniente;
	private String motivo;
	private LocalDateTime fecha;
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
	public ResponseInconvenienteDto(long idInconveniente, String motivo, LocalDateTime fecha) {
		super();
		this.idInconveniente = idInconveniente;
		this.motivo = motivo;
		this.fecha = fecha;
	}
	public static ResponseInconvenienteDto toDto(Inconveniente i) {
		return new ResponseInconvenienteDto(i.getIdInconveniente(), i.getMotivo(), i.getFecha());
	}
}
