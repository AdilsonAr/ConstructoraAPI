package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Cliente;
import com.das.model.Proyecto;
import com.das.repository.ProyectoRepository;

@Service
public class ProyectoService {
	@Autowired
	ProyectoRepository repo;
	public Proyecto create(Proyecto p) {
		return repo.save(p);
	}
	
	public void update(Proyecto p) {
		repo.save(p);
	}
	
	public List<Proyecto> readAll(){
		return repo.findAll();
	}
	
	public List<Proyecto> readCliente(long id){
		Cliente c=new Cliente();
		return repo.findByCliente(c);
	}
	
	public Proyecto readId(long id) {
		return repo.findById(id).get();
	}
}
