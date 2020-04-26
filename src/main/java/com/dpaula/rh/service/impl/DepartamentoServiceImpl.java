package com.dpaula.rh.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dpaula.rh.api.dto.DepartamentoDTO;
import com.dpaula.rh.model.entity.Departamento;
import com.dpaula.rh.model.repository.DepartamentoRepository;
import com.dpaula.rh.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;
	
	public DepartamentoServiceImpl(DepartamentoRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public DepartamentoDTO save(DepartamentoDTO dto) {
		Departamento departamento = this.converter(dto);
		departamento = repository.save(departamento);
		
		return this.converter(departamento);
	}

	@Override
	public DepartamentoDTO find(DepartamentoDTO dto) {
		
		return null;
	}
	
	public DepartamentoDTO find(Integer id) {
		Departamento departamento = repository.findById(id).orElse(null);
		return this.converter(departamento);
	}

	@Override
	public void delete(DepartamentoDTO dto) {
		Departamento departamento = this.converter(dto);
		this.repository.delete(departamento);
	}

	@Override
	public List<DepartamentoDTO> list() {
		
		return null;
	}
	
	@Override
	public Departamento converter(DepartamentoDTO dto) {
		
		Departamento departamento = new Departamento();
		
		departamento.setId(dto.getId());
		departamento.setNome(dto.getNome());
		departamento.setLimiteFunc(dto.getLimiteFunc());
		
		return departamento;
	}
	
	@Override
	public DepartamentoDTO converter(Departamento departamento) {
		
		DepartamentoDTO dto = new DepartamentoDTO();
		
		dto.setId(departamento.getId());
		dto.setNome(departamento.getNome());
		dto.setLimiteFunc(departamento.getLimiteFunc());
		
		return dto;
	}
	

}
