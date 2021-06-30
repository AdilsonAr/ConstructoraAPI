package com.das.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Canal;
import com.das.repository.CanalRepository;

@Service
public class CanalService{
	@Autowired
	CanalRepository repo;
	
	@PostConstruct
	public void init() {
		Canal proyectos=new Canal("Proyectos");
		if(readNombre(proyectos.getNombre())==null) {
			create(proyectos);
		}
	}
	public Canal readNombre(String nombre) {
		return repo.findByNombre(nombre);
	}
	public void create(Canal c) {
		repo.save(c);
	}
}
