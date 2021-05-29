package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Acceso;
import com.das.model.Proyecto;
import com.das.model.Usuario;
import com.das.repository.AccesoRepository;

@Service
public class AccesoService {
	@Autowired
	private AccesoRepository repo;
	public void create(Acceso a) {
		repo.save(a);
	}
	public void delete(long id) {
		Acceso a=new Acceso();
		a.setIdAcceso(id);
		repo.delete(a);
	}
	public List<Acceso> readProyecto(long id){
		Proyecto p=new Proyecto();
		p.setIdProyecto(id);
		return repo.findByProyecto(p);
	}
	public List<Acceso> readUsuario(long id){
		Usuario u=new Usuario();
		u.setIdUsuario(id);
		return repo.findByUsuario(u);
	}
	
	public Acceso read(long idUsuario, long idProyecto) {
		Usuario u=new Usuario();
		u.setIdUsuario(idUsuario);
		Proyecto p=new Proyecto();
		p.setIdProyecto(idProyecto);
		return repo.findByUsuarioAndProyecto(u, p);
	}
}
