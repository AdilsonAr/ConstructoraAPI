package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.MateriaPrima;
import com.das.repository.MateriaPrimaRepository;

@Service
public class MateriaPrimaService {
	@Autowired
	private MateriaPrimaRepository repo;
	public List<MateriaPrima> readAll(){
		return repo.findAll();
	}
	
	public void create(MateriaPrima m) {
		repo.save(m);
	}
	public void update(MateriaPrima m) {
		repo.save(m);
	}
	public void delete(MateriaPrima m) {
		repo.delete(m);
	}
}
