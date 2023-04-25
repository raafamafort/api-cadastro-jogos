// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroJogo(
		@NotBlank 
		String titulo,

		@NotBlank
		String desenvolvedora,

		String distribuidora,

		@NotBlank
		String idiomas,

		@NotBlank
		@Pattern(regexp = "^[1-4]$")
		String jogadores,

		@NotBlank
		@Pattern(regexp = "\\d{4}")
		String lancamento,
		@NotNull
		Genero genero,

		@Valid
		DadosRequisitos requisitos
	) {
}
