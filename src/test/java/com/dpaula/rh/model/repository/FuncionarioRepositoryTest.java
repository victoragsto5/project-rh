package com.dpaula.rh.model.repository;

import java.math.BigDecimal;
import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dpaula.rh.model.entity.Funcionario;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class FuncionarioRepositoryTest {
	
	@Autowired
	private FuncionarioRepository repository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void verifyNomeFuncionario() {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("João Teste");
		funcionario1.setCpf("000000000000191");
		funcionario1.setRg("1213131231457");
		funcionario1.setDataNascimento(new Date());
		funcionario1.setCargo("Comercial Teste");
		funcionario1.setSalario(new BigDecimal(3000));
		funcionario1.setCargaHoraria(new Double(160));
		
		
		entityManager.persist(funcionario1);
		
		//ação/ execução
		Funcionario result = repository.findByNome("João Teste");
		
		//verificacao
		Assertions.assertThat(result).isNotNull();
		
	}
	
//	@Test
//	public void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComOEmail() {
//		//cenário
//		
//		//acao
//		boolean result = repository.existsByEmail("usuario@email.com");
//		
//		//verificacao
//		Assertions.assertThat(result).isFalse();
//	}
//	
//	@Test
//	public void devePersistirUmUsuarioNaBaseDeDados() {
//		//cenário
//		Usuario usuario =criarUsuario();
//		
//		//acao
//		Usuario usuarioSalvo = repository.save(usuario);
//		
//		// verificacao
//		Assertions.assertThat(usuarioSalvo.getId()).isNotNull();
//	}
//	
//	@Test
//	public void deveBuscarUmUsuarioPorEmail() {
//		//cenario
//		Usuario usuario = criarUsuario();
//		entityManager.persist(usuario);
//		
//		//verificacao
//		Optional<Usuario> result = repository.findByEmail("usuario@email.com");
//		
//		Assertions.assertThat( result.isPresent() ).isTrue();
//		
//	}
//	
//	@Test
//	public void deveRetornarVazioAoBuscarUsuarioPorEmailQuandoNaoExisteNaBase() {
//		
//		//verificacao
//		Optional<Usuario> result = repository.findByEmail("usuario@email.com");
//		
//		Assertions.assertThat( result.isPresent() ).isFalse();
//		
//	}
//	
//	public static Usuario criarUsuario() {
//		return Usuario
//				.builder()
//				.nome("usuario")
//				.email("usuario@email.com")
//				.senha("senha")
//				.build();
//	}

}
