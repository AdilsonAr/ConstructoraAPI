package com.das.dto;

import com.das.model.Usuario;

public class ResponseUsuarioDto {
	private long id;
	private String usuario;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ResponseUsuarioDto(long id, String usuario, String role) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.role = role;
	}
	public ResponseUsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static ResponseUsuarioDto toDto(Usuario u) {
		return new ResponseUsuarioDto(u.getIdUsuario(),u.getUsuario(),u.getRole().getRole());
	}
}
