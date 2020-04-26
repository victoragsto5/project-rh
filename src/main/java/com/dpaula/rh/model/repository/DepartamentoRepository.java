package com.dpaula.rh.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpaula.rh.model.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
	
	public Departamento findByNome(String nome);
	

}
