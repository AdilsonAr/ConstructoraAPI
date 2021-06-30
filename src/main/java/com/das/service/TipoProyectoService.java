package com.das.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.das.model.TipoProyecto;
import com.das.repository.TipoProyectoRepository;

@Service
public class TipoProyectoService {
	@Autowired
	private TipoProyectoRepository repo;
	
	@PostConstruct
	public void post() {
		List<String> tipos=new ArrayList<>();
		tipos.add("construcción");
		tipos.add("remodelación");
		tipos.forEach(x->{
			if(repo.findByTipo(x)==null) {
				repo.save(new TipoProyecto(x));
			}
		});
	}
	
	public TipoProyecto read(String tipo) {
		return repo.findByTipo(tipo);
	}
}
