package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.AsignacionMaquinaria;
import com.das.model.Maquinaria;
import com.das.model.Proyecto;
import com.das.repository.AsignacionMaquinariaRepository;

@Service
public class AsignacionMaquinariaService {
	@Autowired
	private AsignacionMaquinariaRepository repo;
	public List<AsignacionMaquinaria> readAll(){
		return repo.findAll();
	}
	
	public List<AsignacionMaquinaria> readProyecto(Proyecto p){
		return repo.findByProyecto(p);
	}
	
	public List<AsignacionMaquinaria> readMaquinaria(Maquinaria m){
		return repo.findByMaquinaria(m);
	}
	
	public void create(AsignacionMaquinaria m) {
		repo.save(m);
	}
	
	public void update(AsignacionMaquinaria m) {
		repo.save(m);
	}
	
	public void delete(AsignacionMaquinaria m) {
		repo.delete(m);
	}
}
