package br.com.impacta.springmvc.gerenciadordespesas.model;

import java.util.Arrays;

public enum Categoria {
    ALIMENTACAO("Alimentação"),
    CUIDADOS_PESSOAIS("Cuidados pessoais"),
    DIVERSOS("Diversos"),
    DOACOES("Doações"),
    EDUCACAO("Educação"),
    LAZER("Lazer"),
    MORADIA("Moradia"),
    SAUDE("Saúde"),
    SUPERMERCADO("Supermercado"),
    TRANSPORTE( "Transporte"),
    VEICULO( "Veículo"),
    VESTUARIO( "Vestuário"),
    VIAGEM( "Viagem");

    private final String nome;

    public String getNome() {
        return nome;
    }

    Categoria(String nome) {
        this.nome = nome;
    }
}
