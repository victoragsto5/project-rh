package com.dpaula.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpaula.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
