package com.dpaula.rh.api.dto;


public class DepartamentoDTO {

	private Integer id;
	private String nome;
	private Integer limiteFunc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getLimiteFunc() {
		return limiteFunc;
	}
	public void setLimiteFunc(Integer limiteFunc) {
		this.limiteFunc = limiteFunc;
	}

}
