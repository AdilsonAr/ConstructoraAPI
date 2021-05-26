package com.das.dto;

import com.das.model.Usuario;

public class SendUsuarioDto {
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
	public SendUsuarioDto(long id, String usuario, String role) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.role = role;
	}
	public SendUsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SendUsuarioDto toDto(Usuario u) {
		return new SendUsuarioDto(u.getIdUsuario(),u.getUsuario(),u.getRole().getRole());
	}
}
