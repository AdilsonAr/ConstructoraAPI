package com.das.dto;

import java.time.LocalDateTime;
import com.das.model.*;

public class AsignacionEmpleadoDto {
	private long idAsignacionEmpleado;
	private LocalDateTime fecha;
	private String estado;
	private long Proyecto;
	private long Empleado;
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
	public long getProyecto() {
		return Proyecto;
	}
	public void setProyecto(long proyecto) {
		Proyecto = proyecto;
	}
	public long getEmpleado() {
		return Empleado;
	}
	public void setEmpleado(long empleado) {
		Empleado = empleado;
	}
	public AsignacionEmpleadoDto(long idAsignacionEmpleado, LocalDateTime fecha, String estado, long proyecto,
			long empleado) {
		super();
		this.idAsignacionEmpleado = idAsignacionEmpleado;
		this.fecha = fecha;
		this.estado = estado;
		Proyecto = proyecto;
		Empleado = empleado;
	}
	
	public static AsignacionEmpleado toModel(AsignacionEmpleadoDto a) {
		Proyecto p=new Proyecto();
		p.setIdProyecto(a.getProyecto());
		Empleado e =new Empleado();
		e.setIdEmpleado(a.getEmpleado());
		return new AsignacionEmpleado(a.getIdAsignacionEmpleado(), a.getFecha(), a.getEstado()
				, p, e);
	}
	
}
