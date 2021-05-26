package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Cliente;
import com.das.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public void create(Cliente c) {
		repo.save(c);
	}
	
	public void update(Cliente c) {
		repo.save(c);
	}
	
	public void delete(Cliente c) {
		repo.delete(c);
	}
	
	public List<Cliente> readAll(){
		return repo.findAll();
	}
	
	public Cliente read(long id){
		return repo.findById(id).get();
	}
}
