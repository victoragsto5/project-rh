package com.dpaula.rh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpaula.rh.model.entity.Funcionario;
import com.dpaula.rh.model.repository.FuncionarioRepository;
import com.dpaula.rh.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository repository;
	
	public FuncionarioServiceImpl(FuncionarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public Funcionario save(Funcionario funcionario) {
		
		return this.repository.save(funcionario);
	}

	@Override
	public Funcionario update(Funcionario funcionario) {
		
		return this.repository.save(funcionario);
	}

	@Override
	public Funcionario find(Funcionario funcionario) {
		
		return null;
	}

	@Override
	public void delete(Funcionario funcionario) {
		
		 this.repository.delete(funcionario);
	}

	@Override
	public List<Funcionario> list() {
		
		return null;
	}
	

}
