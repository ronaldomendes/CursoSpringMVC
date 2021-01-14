package br.com.impacta.springmvc.gerenciadordespesas.model;

import java.util.Arrays;

public enum Categoria {
    ALIMENTACAO(1, "Alimentação"),
    CUIDADOS_PESSOAIS(2, "Cuidados pessoais"),
    DIVERSOS(3, "Diversos"),
    DOACOES(4, "Doações"),
    EDUCACAO(5, "Educação"),
    LAZER(6, "Lazer"),
    MORADIA(7, "Moradia"),
    SAUDE(8, "Saúde"),
    SUPERMERCADO(9, "Supermercado"),
    TRANSPORTE(10, "Transporte"),
    VEICULO(11, "Veículo"),
    VESTUARIO(12, "Vestuário"),
    VIAGEM(13, "Viagem");

    private final Integer id;
    private final String codigo;

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    Categoria(Integer id, String codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public static Categoria toEnum(Integer id) {
        return Arrays.stream(Categoria.values()).filter(c -> id.equals(c.getId()))
                .findFirst().orElseThrow(() -> new RuntimeException("Categoria inválida: " + id));
    }
}
