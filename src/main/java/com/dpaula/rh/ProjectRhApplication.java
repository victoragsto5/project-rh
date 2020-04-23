package com.dpaula.rh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dpaula.rh.service.FuncionarioService;

@SpringBootApplication
public class ProjectRhApplication {
	
	@Autowired
	FuncionarioService service;

	public static void main(String[] args) {
		SpringApplication.run(ProjectRhApplication.class, args);
	}

}
