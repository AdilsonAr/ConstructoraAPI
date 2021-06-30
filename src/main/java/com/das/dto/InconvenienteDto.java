package com.das.dto;

import java.time.LocalDateTime;
import com.das.model.Inconveniente;
import com.das.model.Proyecto;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InconvenienteDto {
	private long idInconveniente;
	private String motivo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime fecha;
	private long proyecto;
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
	public long getProyecto() {
		return proyecto;
	}
	public void setProyecto(long proyecto) {
		this.proyecto = proyecto;
	}
	public InconvenienteDto(long idInconveniente, String motivo, LocalDateTime fecha, long proyecto) {
		super();
		this.idInconveniente = idInconveniente;
		this.motivo = motivo;
		this.fecha = fecha;
		this.proyecto = proyecto;
	}
	public static Inconveniente toModel(InconvenienteDto i) {
		Proyecto proyecto=new Proyecto();
		proyecto.setIdProyecto(i.getProyecto());
		return new Inconveniente(i.getIdInconveniente(), i.getMotivo(), i.getFecha(), proyecto);
	}
}
