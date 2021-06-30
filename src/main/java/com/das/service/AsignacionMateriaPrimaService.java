package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.AsignacionMateriaPrima;
import com.das.model.MateriaPrima;
import com.das.model.Proyecto;
import com.das.repository.AsignacionMateriaPrimaRepository;

@Service
public class AsignacionMateriaPrimaService {
	@Autowired
	private AsignacionMateriaPrimaRepository repo;
	public List<AsignacionMateriaPrima> readAll(){
		return repo.findAll();
	}
	
	public List<AsignacionMateriaPrima> readProyecto(Proyecto p){
		return repo.findByProyecto(p);
	}
	
	public List<AsignacionMateriaPrima> readMateriaPrima(MateriaPrima m){
		return repo.findByMateriaPrima(m);
	}
	
	public void create(AsignacionMateriaPrima m) {
		repo.save(m);
	}
	
	public void update(AsignacionMateriaPrima m) {
		repo.save(m);
	}
	
	public void delete(AsignacionMateriaPrima m) {
		repo.delete(m);
	}
}
