package com.das.service;

import com.das.dto.RequestUsuarioDto;
import com.das.model.Usuario;
//dependency inversion
//la clase controller de usuario(alto nivel) se comunica con los 
//mapper de usuario(bajo nivel) por una abstraccion
public interface MapUsuarioStrategy {
	public abstract Usuario map (RequestUsuarioDto u) throws Exception;
}
