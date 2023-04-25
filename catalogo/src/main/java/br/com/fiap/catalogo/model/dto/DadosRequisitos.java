// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosRequisitos(
		String sistema,
		@NotBlank
		String processador,
		@NotBlank
		String memoria,
		@NotBlank
		String placa,
		@NotBlank
		String armazenamento
	) {
}
