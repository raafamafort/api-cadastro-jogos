// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Jogos;
import br.com.fiap.catalogo.model.entity.Genero;

public record DadosListagemJogo(
		Long id,
		String titulo,
		String desenvolvedora,
		String jogadores,
		Genero genero,
		String armazenamento

	) {
	
	public DadosListagemJogo(Jogos jogos) {
		this(
				jogos.getId(),
				jogos.getTitulo(),
				jogos.getDesenvolvedora(),
				jogos.getJogadores(),
				jogos.getGenero(),
				jogos.getRequisitos().getArmazenamento()
			);
	}

}
