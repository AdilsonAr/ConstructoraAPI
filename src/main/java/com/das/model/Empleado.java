package com.das.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpleado;
	private String nombres;
	private String apellidos;
	private String nit;
	private String dui;
	private String telefono;
	private String direccion;
	private double sueldo;
	@OneToMany(mappedBy = "empleado")
	private List<AsignacionEmpleado> asignacionEmpleados;
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
	public List<AsignacionEmpleado> getAsignacionEmpleados() {
		return asignacionEmpleados;
	}
	public void setAsignacionEmpleados(List<AsignacionEmpleado> asignacionEmpleados) {
		this.asignacionEmpleados = asignacionEmpleados;
	}
	public Empleado(String nombres, String apellidos, String nit, String dui, String telefono, String direccion,
			double sueldo, List<AsignacionEmpleado> asignacionEmpleados) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nit = nit;
		this.dui = dui;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldo = sueldo;
		this.asignacionEmpleados = asignacionEmpleados;
	}
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
