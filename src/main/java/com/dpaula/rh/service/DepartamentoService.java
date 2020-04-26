package com.dpaula.rh.service;

import java.util.List;

import com.dpaula.rh.api.dto.DepartamentoDTO;
import com.dpaula.rh.model.entity.Departamento;

public interface DepartamentoService {
	
	public DepartamentoDTO save(DepartamentoDTO dto);
	
	public DepartamentoDTO find(DepartamentoDTO dto);

	public DepartamentoDTO find(Integer id);

	public void delete(DepartamentoDTO dto);
	
	public List<DepartamentoDTO> list(); 
	
	public Departamento converter(DepartamentoDTO dto);
	
	public DepartamentoDTO converter(Departamento departamento);
}
