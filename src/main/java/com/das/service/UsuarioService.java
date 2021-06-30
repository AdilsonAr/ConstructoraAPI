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
import com.das.model.Canal;
import com.das.model.Role;
import com.das.model.Usuario;
import com.das.repository.RoleRepository;
import com.das.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{
	@Autowired
	private UsuarioRepository repo;
	@Autowired
	private RoleRepository roleRepo;
	private List<Roles> roles=Arrays.asList(Roles.values());
	@Autowired
	private CanalService cservice;
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
		Usuario creado= repo.save(u);
		if(creado.getRole().getRole().equals(Roles.ADMIN.getRole()) 
				|| creado.getRole().getRole().equals(Roles.GESTOR_PROYECTOS.getRole())) {
			Canal canalProyectos = cservice.readNombre("Proyectos");
			canalProyectos.attach(creado);
		}
	}
	
	public long readId(String username) {
		return (repo.findByUsuario(username)).getIdUsuario();
	}
	
	public Usuario readUsuario(String username) {
		return repo.findByUsuario(username);
	}
	
	public void update(Usuario u) {
		repo.save(u);
	}
	
	public void delete(long id) {
		Usuario u=new Usuario();
		u.setIdUsuario(id);
		repo.delete(u);
	}
	
	public Usuario read(long id) {
		return repo.findById(id).get();
	}
	
	public List<Usuario> readAll() {
		return repo.findAll();
	}
}
