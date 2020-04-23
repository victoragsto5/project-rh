package com.dpaula.rh.model.entity;

import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
	
	@Id
	@Column(name = "ID_FUNCIONARIO", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOME_FUNCIONARIO", nullable = false)
	private String nome;
	
	@Column(name = "CPF_FUNCIONARIO", nullable = false)
	private String cpf;
	
	@Column(name = "RG_FUNCIONARIO", nullable = false)
	private String rg;
	
	@Column(name = "DATA_NASCIMENTO_FUNCIONARIO", nullable = false)
	private Date dataNascimento;
	
	@Column(name = "EMAIL_FUNCIONARIO", nullable = false)
	private String email;
	
	@Column(name = "CARGO_FUNCIONARIO", nullable = false)
	private String cargo;
	
	@Column(name = "SALARIO_FUNCIONARIO", nullable = false)
	private String salario;
	
	@Column(name = "CARGA_HORARIA_FUNCIONARIO", nullable = false)
	private String cargaHoraria;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
