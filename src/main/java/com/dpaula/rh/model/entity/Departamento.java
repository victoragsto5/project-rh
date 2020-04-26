package com.dpaula.rh.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
	
	@Id
	@Column(name = "Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "LIMITE_FUNCIONARIO", nullable = false)
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
