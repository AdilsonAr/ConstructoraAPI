package com.das.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.das.constants.Roles;
import com.das.model.Role;
import com.das.model.Usuario;
import com.das.repository.RoleRepository;
import com.das.repository.UsuarioRepository;
@Service
public class UsuarioService implements UserDetailsService{
	@Autowired
	UsuarioRepository repo;
	@Autowired
	RoleRepository roleRepo;
	List<Roles> roles=Arrays.asList(Roles.values());
	
	@PostConstruct
	public void roles() {
		roles.forEach(x->{
			if(roleRepo.findByRole(x.getRole())==null) {
				roleRepo.save(new Role(x.getRole()));
			}
		});
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repo.findByUsuario(username);
	}
	
	public void create(Usuario u) {
		repo.save(u);
	}
	
	public void update(Usuario u) {
		repo.save(u);
	}
	
	public void delete(Usuario u) {
		repo.delete(u);
	}
	
	public Usuario read(long id) {
		return repo.findById(id).get();
	}
	
	public List<Usuario> readAll() {
		return repo.findAll();
	}
}
