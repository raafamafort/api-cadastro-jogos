// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Genero;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoJogo(
		@NotNull
		Long id,
		String titulo,
		String desenvolvedora,
		String distribuidora,
		String idiomas,
		@Pattern(regexp = "^[1-4]$")
		String jogadores,
		@Pattern(regexp = "\\d{4}")
		String lancamento,
		Genero genero,
		DadosRequisitos requisitos
	) {

}
