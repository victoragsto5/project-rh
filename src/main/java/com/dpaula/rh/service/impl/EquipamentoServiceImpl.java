package com.dpaula.rh.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dpaula.rh.api.dto.EquipamentoDTO;
import com.dpaula.rh.model.entity.Equipamento;
import com.dpaula.rh.model.repository.EquipamentoRepository;
import com.dpaula.rh.service.EquipamentoService;

@Service
public class EquipamentoServiceImpl implements EquipamentoService {
	
	@Autowired
	private EquipamentoRepository repository;
	
	public EquipamentoServiceImpl(EquipamentoRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public EquipamentoDTO save(EquipamentoDTO dto) {
		Equipamento equipamento = this.converter(dto);
		equipamento = repository.save(equipamento);
		
		return this.converter(equipamento);
	}

	@Override
	public EquipamentoDTO find(EquipamentoDTO dto) {
		
		return null;
	}
	
	public EquipamentoDTO find(Integer id) {
		Equipamento equipamento = repository.findById(id).orElse(null);
		return this.converter(equipamento);
	}

	@Override
	public void delete(EquipamentoDTO dto) {
		Equipamento equipamento = this.converter(dto);
		this.repository.delete(equipamento);
	}

	@Override
	public List<EquipamentoDTO> list() {
		
		return null;
	}
	
	@Override
	public Equipamento converter(EquipamentoDTO dto) {
		
		Equipamento equipamento = new Equipamento();
		
		equipamento.setId(dto.getId());
		equipamento.setDescricao(dto.getDescricao());
		equipamento.setQuantidade(dto.getQuantidade());
		
		return equipamento;
	}
	
	@Override
	public EquipamentoDTO converter(Equipamento equipamento) {
		
		EquipamentoDTO dto = new EquipamentoDTO();
		
		dto.setId(equipamento.getId());
		dto.setDescricao(equipamento.getDescricao());
		dto.setQuantidade(equipamento.getQuantidade());
		
		return dto;
	}
	

}
