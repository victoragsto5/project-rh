package com.dpaula.rh.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpaula.rh.model.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	public Funcionario findByNome(String nome);
	

}
