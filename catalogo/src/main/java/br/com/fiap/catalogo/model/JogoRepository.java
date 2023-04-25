// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.catalogo.model.entity.Jogos;

public interface JogoRepository extends JpaRepository<Jogos, Long> {
	
	Page<Jogos> findAllByAtivoTrue(Pageable paginacao);

}
