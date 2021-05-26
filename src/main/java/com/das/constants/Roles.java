package com.das.constants;

public enum Roles {
	ADMIN("ADMIN"),
	READER("READER"),
	AUDITOR("AUDITOR"),
	GESTOR_PROYECTOS("GESTOR_PROYECTOS");
	
	private String role;

	private Roles(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}	
}
