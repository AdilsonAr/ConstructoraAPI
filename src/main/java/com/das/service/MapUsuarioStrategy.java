package com.das.service;

import com.das.dto.RequestUsuarioDto;
import com.das.model.Usuario;

public interface MapUsuarioStrategy {
	public abstract Usuario map (RequestUsuarioDto u) throws Exception;
}
