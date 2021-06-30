package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.AsignacionEmpleado;
import com.das.model.Empleado;
import com.das.model.Proyecto;
import com.das.repository.AsignacionEmpleadoRepository;

@Service
public class AsignacionEmpleadoService {
	@Autowired
	AsignacionEmpleadoRepository repo;
	public List<AsignacionEmpleado> readAll(){
		return repo.findAll();
	}
	
	public List<AsignacionEmpleado> readProyecto(Proyecto p){
		return repo.findByProyecto(p);
	}
	
	public List<AsignacionEmpleado> readEmpleado(Empleado e){
		return repo.findByEmpleado(e);
	}
	
	public void create(AsignacionEmpleado m) {
		repo.save(m);
	}
	
	public void update(AsignacionEmpleado m) {
		repo.save(m);
	}
	
	public void delete(AsignacionEmpleado m) {
		repo.delete(m);
	}
}
