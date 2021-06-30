package com.das.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.das.constants.Roles;
import com.das.dto.RequestUsuarioDto;
import com.das.model.Role;
import com.das.model.Usuario;
import com.das.repository.RoleRepository;
//dependency inversion
//la clase controller de usuario(alto nivel) se comunica con los 
//mapper de usuario(bajo nivel) por una abstraccion
public class MapUsuarioWithReaderRole implements MapUsuarioStrategy{
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private PasswordEncoder enc;
	
	@Override
	public Usuario map(RequestUsuarioDto u) throws Exception {
		Role r=roleRepo.findByRole(Roles.READER.getRole());
		Usuario usuario=RequestUsuarioDto.toModel(u);
		usuario.setRole(r);
		usuario.setClave(enc.encode(usuario.getClave()));
		return usuario;
	}
}
