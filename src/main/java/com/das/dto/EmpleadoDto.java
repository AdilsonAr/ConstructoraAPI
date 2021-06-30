package com.das.dto;

import com.das.model.Empleado;

public class EmpleadoDto {
	private long idEmpleado;
	private String nombres;
	private String apellidos;
	private String nit;
	private String dui;
	private String telefono;
	private String direccion;
	private double sueldo;
	public long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public EmpleadoDto(long idEmpleado, String nombres, String apellidos, String nit, String dui, String telefono,
			String direccion, double sueldo) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nit = nit;
		this.dui = dui;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldo = sueldo;
	}
	
	public static EmpleadoDto toDto(Empleado e) {
		return new EmpleadoDto(e.getIdEmpleado(), e.getNombres(), e.getApellidos(),
				e.getNit(), e.getDui(), e.getTelefono(), e.getDireccion(), e.getSueldo());
	}
	
	public static Empleado toModel(EmpleadoDto e) {
		return new Empleado(e.getNombres(), e.getApellidos(),
				e.getNit(), e.getDui(), e.getTelefono(), e.getDireccion(), e.getSueldo());
	}
}
