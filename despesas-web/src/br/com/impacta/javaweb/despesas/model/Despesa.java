package br.com.impacta.javaweb.despesas.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Despesa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String descricao;
	private CategoriaDespesa categoria;
	private LocalDate data;
	private Double valor;
	private String observacoes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaDespesa getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDespesa categoria) {
		this.categoria = categoria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Despesa() {
	}

	public Despesa(String descricao, CategoriaDespesa categoria, LocalDate data, Double valor) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.data = data;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Despesa [descricao=" + descricao + ", categoria=" + categoria + ", data=" + data + ", valor=" + valor
				+ ", observacoes=" + observacoes + "]";
	}
}
