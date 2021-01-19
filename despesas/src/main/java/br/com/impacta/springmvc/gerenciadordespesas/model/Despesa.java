package br.com.impacta.springmvc.gerenciadordespesas.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TB_DESPESA")
public class Despesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "A descrição é obrigatória")
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @NotNull(message = "A data é obrigatória")
    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @NotNull(message = "O valor é obrigatório")
    @DecimalMin(value = "1.00",message = "O valor não deve ser menor que 1 real")
    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal valor;
    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Despesa(Long id, String descricao, Categoria categoria, LocalDate data, BigDecimal valor, String obs) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.valor = valor;
        this.observacoes = obs;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return Objects.equals(id, despesa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
