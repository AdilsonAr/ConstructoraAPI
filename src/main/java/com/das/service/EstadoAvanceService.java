package com.das.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.EstadoAvance;
import com.das.repository.EstadoAvanceRepository;

@Service
public class EstadoAvanceService {
	@Autowired
	private EstadoAvanceRepository repo;
	@PostConstruct
	public void post() {
		List<String> estados=new ArrayList<>();
		estados.add("NI");
		estados.add("EE");
		estados.add("PF");
		estados.forEach(x->{
			if(repo.findByEstado(x)==null) {
				repo.save(new EstadoAvance(x));
			}
		});
	}
	
	public EstadoAvance read(String estado) {
		return repo.findByEstado(estado);
	}
}
