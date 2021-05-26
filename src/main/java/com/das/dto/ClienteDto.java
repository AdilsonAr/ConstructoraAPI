package com.das.dto;

import com.das.model.Cliente;

public class ClienteDto {
	private long idCliente;
	private String nombre;
	private String direccion;
	private String correo;
	private String telefono;
	private String nit;
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public ClienteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClienteDto(long idCliente, String nombre, String direccion, String correo, String telefono, String nit) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.nit = nit;
	}
	public static Cliente toModel(ClienteDto c) {
		return new Cliente(c.getIdCliente(),c.getNombre(),c.getDireccion(),
				c.getCorreo(),c.getTelefono(),c.getNit());
	}
	
	public static ClienteDto toDto(Cliente c) {
		return new ClienteDto(c.getIdCliente(),c.getNombre(),c.getDireccion(),
				c.getCorreo(),c.getTelefono(),c.getNit());
	}
	
}
