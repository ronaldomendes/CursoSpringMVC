package br.com.impacta.springmvc.gerenciadordespesas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descricao;
    private Categoria categoria;
    private LocalDate data;
    private BigDecimal valor;
    private String observacoes;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
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

    public Despesa(String descricao, Categoria categoria, LocalDate data, BigDecimal valor, String observacoes) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.valor = valor;
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Despesa{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", data=").append(data);
        sb.append(", valor=").append(valor);
        sb.append(", observacoes='").append(observacoes).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
