package com.das.service;

import com.das.dto.UsuarioDto;
import com.das.model.Usuario;

public interface MapUsuarioStrategy {
	public abstract Usuario map (UsuarioDto u) throws Exception;
}
