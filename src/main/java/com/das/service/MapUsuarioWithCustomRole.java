package com.das.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.das.constants.Roles;
import com.das.dto.RequestUsuarioDto;
import com.das.model.Role;
import com.das.model.Usuario;
import com.das.repository.RoleRepository;

public class MapUsuarioWithCustomRole implements MapUsuarioStrategy{
	@Autowired
	PasswordEncoder enc;
	@Autowired
	RoleRepository roleRepo;
	private List<Roles> roles=Arrays.asList(Roles.values());
	private class MyBool{
		private boolean value;

		public boolean isValue() {
			return value;
		}

		public MyBool(boolean value) {
			super();
			this.value = value;
		}

		public void setValue(boolean value) {
			this.value = value;
		}
	}
	
	@Override
	public Usuario map(RequestUsuarioDto u) throws IllegalArgumentException{
		MyBool valid=new MyBool(false);
		roles.forEach(x->{
			if(u.getRole().equals(x.getRole())) {
				valid.setValue(true);
			}
		});
		if(valid.isValue()) {
			Role r=roleRepo.findByRole(u.getRole());
			Usuario usuario=RequestUsuarioDto.toModel(u);
			usuario.setRole(r);
			usuario.setClave(enc.encode(usuario.getClave()));
			return usuario;
		}else {
			throw new IllegalArgumentException("el rol insertado no es valido");
		}
	}

}
