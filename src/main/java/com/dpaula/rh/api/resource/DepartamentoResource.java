package com.dpaula.rh.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dpaula.rh.api.dto.DepartamentoDTO;
import com.dpaula.rh.exception.RegraNegocioException;
import com.dpaula.rh.service.DepartamentoService;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoResource {

	@Autowired
	private DepartamentoService service;
	
//	@GetMapping
//	public String index() {
//		return "Departamento Resource !!";
//	}
	
	@GetMapping
	public ResponseEntity buscar(
		@RequestParam(value ="id" , required = true)Integer id
	){
		DepartamentoDTO dto = service.find(id);
		return ResponseEntity.ok(dto);
	}

	@PostMapping
	public ResponseEntity salvar(@RequestBody DepartamentoDTO dto ) {
		
		try {
			DepartamentoDTO result = service.save(dto);
			return new ResponseEntity(result, HttpStatus.CREATED);
			
		}catch (RegraNegocioException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	
	
}
