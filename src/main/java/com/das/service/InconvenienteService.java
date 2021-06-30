package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Inconveniente;
import com.das.repository.InconvenienteRepository;

@Service
public class InconvenienteService {
	@Autowired
	private InconvenienteRepository repo;
	public List<Inconveniente> readAll(){
		return repo.findAll();
	}
	
	public void create(Inconveniente i) {
		repo.save(i);
	}
	public void update(Inconveniente i) {
		repo.save(i);
	}
	public void delete(Inconveniente i) {
		repo.delete(i);
	}
}
