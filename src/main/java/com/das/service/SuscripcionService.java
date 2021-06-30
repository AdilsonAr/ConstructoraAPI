package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Canal;
import com.das.model.Suscripcion;
import com.das.model.Usuario;
import com.das.repository.SuscripcionRepository;

@Service
public class SuscripcionService {
	@Autowired
	private SuscripcionRepository repo;
	public void create(Suscripcion s) {
		repo.save(s);
	}
	
	public List<Suscripcion> readUsuario(Usuario u){
		return repo.findByUsuario(u);
	}
	public List<Suscripcion> readCanal(Canal c){
		return repo.findByCanal(c);
	}
}
