package com.dpaula.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpaula.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	boolean existsByEmail(String email);
}
