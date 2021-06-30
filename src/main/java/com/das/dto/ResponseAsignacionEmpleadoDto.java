package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.AsignacionEmpleado;

public class ResponseAsignacionEmpleadoDto {
	private long idAsignacionEmpleado;
	private LocalDateTime fecha;
	private String estado;
	private String Proyecto;
	private String Empleado;
	public long getIdAsignacionEmpleado() {
		return idAsignacionEmpleado;
	}
	public void setIdAsignacionEmpleado(long idAsignacionEmpleado) {
		this.idAsignacionEmpleado = idAsignacionEmpleado;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getProyecto() {
		return Proyecto;
	}
	public void setProyecto(String proyecto) {
		Proyecto = proyecto;
	}
	public String getEmpleado() {
		return Empleado;
	}
	public void setEmpleado(String empleado) {
		Empleado = empleado;
	}
	public ResponseAsignacionEmpleadoDto(long idAsignacionEmpleado, LocalDateTime fecha, String estado, String proyecto,
			String empleado) {
		super();
		this.idAsignacionEmpleado = idAsignacionEmpleado;
		this.fecha = fecha;
		this.estado = estado;
		Proyecto = proyecto;
		Empleado = empleado;
	}
	
	public static ResponseAsignacionEmpleadoDto toDto(AsignacionEmpleado a) {
		return new ResponseAsignacionEmpleadoDto(a.getIdAsignacionEmpleado()
				, a.getFecha(), a.getEstado(), a.getProyecto().getNombre(), a.getEmpleado().getNombres());
	}
}
