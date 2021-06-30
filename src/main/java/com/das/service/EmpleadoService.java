package com.das.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.das.model.Empleado;
import com.das.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	EmpleadoRepository repo;
	
	public List<Empleado> readAll(){
		return repo.findAll();
	}
	
	public void create(Empleado e) {
		repo.save(e);
	}
	public void update(Empleado e) {
		repo.save(e);
	}
	public void delete(Empleado e) {
		repo.delete(e);
	}
}
