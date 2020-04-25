package com.dpaula.rh.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dpaula.rh.api.dto.FuncionarioDTO;
import com.dpaula.rh.model.entity.Funcionario;
import com.dpaula.rh.model.repository.FuncionarioRepository;
import com.dpaula.rh.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;
	
	public FuncionarioServiceImpl(FuncionarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public FuncionarioDTO save(FuncionarioDTO dto) {
		Funcionario funcionario = this.converter(dto);
		funcionario = repository.save(funcionario);
		
		return this.converter(funcionario);
	}

	@Override
	public FuncionarioDTO find(FuncionarioDTO dto) {
		
		return null;
	}
	
	public FuncionarioDTO find(Integer id) {
		Funcionario funcionario = repository.findById(id).orElse(null);
		return this.converter(funcionario);
	}

	@Override
	public void delete(FuncionarioDTO dto) {
		Funcionario funcionario = this.converter(dto);
		this.repository.delete(funcionario);
	}

	@Override
	public List<FuncionarioDTO> list() {
		
		return null;
	}
	
	@Override
	public Funcionario converter(FuncionarioDTO dto) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(dto.getId());
		funcionario.setNome(dto.getNome());
		funcionario.setCpf(dto.getCpf());
		funcionario.setRg(dto.getRg());
		funcionario.setDataNascimento(dto.getDataNascimento());
		funcionario.setEmail(dto.getEmail());
		funcionario.setCargo(dto.getCargo());
		funcionario.setSalario(dto.getSalario());
		funcionario.setCargaHoraria(dto.getCargaHoraria());
		
		return funcionario;
	}
	
	@Override
	public FuncionarioDTO converter(Funcionario funcionario) {
		
		FuncionarioDTO dto = new FuncionarioDTO();
		
		dto.setId(funcionario.getId());
		dto.setNome(funcionario.getNome());
		dto.setCpf(funcionario.getCpf());
		dto.setRg(funcionario.getRg());
		dto.setDataNascimento(funcionario.getDataNascimento());
		dto.setEmail(funcionario.getEmail());
		dto.setCargo(funcionario.getCargo());
		dto.setSalario(funcionario.getSalario());
		dto.setCargaHoraria(funcionario.getCargaHoraria());
		
		return dto;
	}
	

}
