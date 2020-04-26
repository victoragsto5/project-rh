package com.dpaula.rh.service;

import java.util.List;

import com.dpaula.rh.api.dto.EquipamentoDTO;
import com.dpaula.rh.model.entity.Equipamento;

public interface EquipamentoService {
	
	public EquipamentoDTO save(EquipamentoDTO dto);
	
	public EquipamentoDTO find(EquipamentoDTO dto);

	public EquipamentoDTO find(Integer id);

	public void delete(EquipamentoDTO dto);
	
	public List<EquipamentoDTO> list(); 
	
	public Equipamento converter(EquipamentoDTO dto);
	
	public EquipamentoDTO converter(Equipamento equipamento);
}
