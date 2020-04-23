package com.dpaula.rh.service;

import java.util.List;

import com.dpaula.rh.model.entity.Funcionario;

public interface FuncionarioService {
	
	public Funcionario save(Funcionario funcionario);
	
	public Funcionario update(Funcionario funcionario);
	
	public Funcionario find(Funcionario funcionario);
	
	public void delete(Funcionario funcionario);
	
	public List<Funcionario> list(); 
}
