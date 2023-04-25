// RM 95699 - RAFAEL MAFORT COIMBRA ; RM 92875 - VITOR MANTOVANI FREITAS

package br.com.fiap.catalogo.model.entity;

import br.com.fiap.catalogo.model.dto.DadosRequisitos;
import jakarta.persistence.Embeddable;

@Embeddable
public class Requisitos {

	private String sistema;
	private String processador;
	private String memoria;
	private String placa;
	private String armazenamento;
	
	public Requisitos() {}
	
	public Requisitos(DadosRequisitos dados) {
		this.sistema = dados.sistema();
		this.processador = dados.processador();
		this.memoria = dados.memoria();
		this.placa = dados.placa();
		this.armazenamento = dados.armazenamento();
	}
	
	public void atualizarInformacoes(DadosRequisitos dados) {
		if (dados.sistema() != null) {
			this.sistema = dados.sistema();
		}
		if (dados.processador() != null) {
			this.processador = dados.processador();
		}
		if (dados.memoria() != null) {
			this.memoria = dados.memoria();
		}
		if (dados.placa() != null) {
			this.placa = dados.placa();
		}
		if (dados.armazenamento() != null) {
			this.armazenamento = dados.armazenamento();
		}
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
}
