package com.dpaula.rh.service;

import java.util.List;

import com.dpaula.rh.api.dto.FuncionarioDTO;
import com.dpaula.rh.model.entity.Funcionario;

public interface FuncionarioService {
	
	public FuncionarioDTO save(FuncionarioDTO dto);
	
	public FuncionarioDTO find(FuncionarioDTO dto);

	public FuncionarioDTO find(Integer id);
	
	public void delete(FuncionarioDTO dto);
	
	public List<FuncionarioDTO> list(); 
	
	public Funcionario converter(FuncionarioDTO dto);

	public FuncionarioDTO converter(Funcionario funcionario);
}
