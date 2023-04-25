// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.catalogo.model.JogoRepository;
import br.com.fiap.catalogo.model.dto.DadosAtualizacaoJogo;
import br.com.fiap.catalogo.model.dto.DadosCadastroJogo;
import br.com.fiap.catalogo.model.dto.DadosListagemJogo;
import br.com.fiap.catalogo.model.entity.Jogos;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/jogos")
public class JogoController {
	
	@Autowired
	private JogoRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroJogo dados) {
		repository.save(new Jogos(dados));
	}
	
	@GetMapping
	public Page<DadosListagemJogo> listar(
			@PageableDefault(size=5, sort= {"titulo"}) Pageable paginacao){
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemJogo:: new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoJogo dados) {
		Jogos jogos = new Jogos();
		jogos = repository.getReferenceById(dados.id());
		jogos.atualizarInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Jogos jogos = new Jogos();
		jogos = repository.getReferenceById(id);
		jogos.excluir();
	}

}










