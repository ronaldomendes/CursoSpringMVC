package br.com.impacta.springmvc.gerenciadordespesas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cotacao {

    @JsonIgnore
    private Moeda moeda;

    @JsonProperty(value = "ask")
    private String precoVenda;

    @JsonProperty(value = "bid")
    private String precoCompra;

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Cotacao() {
    }

    public Cotacao(Moeda moeda, String precoVenda, String precoCompra) {
        this.moeda = moeda;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
    }

    @Override
    public String toString() {
        return "Cotacao{" +
                "moeda=" + moeda +
                ", precoVenda='" + precoVenda + '\'' +
                ", precoCompra='" + precoCompra + '\'' +
                '}';
    }
}
