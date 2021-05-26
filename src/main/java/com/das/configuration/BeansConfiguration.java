package com.das.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.das.service.MapUsuarioWithCustomRole;
import com.das.service.MapUsuarioWithReaderRole;

@Configuration
public class BeansConfiguration {
	@Bean(name = "withCustomRole")
	public MapUsuarioWithCustomRole getMapperCustomRole() {
		return new MapUsuarioWithCustomRole();
	}
	
	@Bean(name = "withReaderRole")
	public MapUsuarioWithReaderRole getMapperReaderRole() {
		return new MapUsuarioWithReaderRole();
	}
}
