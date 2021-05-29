package com.das.dto;

import com.das.model.Usuario;

public class RequestUsuarioDto {
	private long id;
	private String usuario;
	private String clave;
	private String role;
	
	public RequestUsuarioDto(long id, String usuario, String clave, String role) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public RequestUsuarioDto(String usuario, String clave, String rol) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.role = rol;
	}
	public RequestUsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Usuario toModel(RequestUsuarioDto u) {
		return new Usuario(u.getId(), u.getUsuario(),u.getClave());
	}
	
	public static RequestUsuarioDto toDto(Usuario u) {
		return new RequestUsuarioDto(u.getUsuario(),u.getClave(),u.getRole().getRole());
	}
	//temp
	public static Usuario toModelWithId(RequestUsuarioDto u) {
		return new Usuario(u.getId(), u.getUsuario(),u.getClave());
	}
	
}
