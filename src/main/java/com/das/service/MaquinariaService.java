package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Maquinaria;
import com.das.repository.MaquinariaRepository;

@Service
public class MaquinariaService {
    @Autowired
	private MaquinariaRepository repo;
    public void create(Maquinaria m) {
    	repo.save(m);
    }
    public void update(Maquinaria m) {
    	repo.save(m);
    }
    
    public void delete(Maquinaria m) {
    	repo.delete(m);
    }
    
    public List<Maquinaria> readAll(){
    	return repo.findAll();
    }
}
