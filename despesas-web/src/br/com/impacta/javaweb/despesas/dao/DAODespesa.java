package br.com.impacta.javaweb.despesas.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.javaweb.despesas.model.CategoriaDespesa;
import br.com.impacta.javaweb.despesas.model.Despesa;

public class DAODespesa {

	private List<Despesa> despesas = new ArrayList<>();

	public List<Despesa> getDespesas() {
		despesas.add(new Despesa("Restaurante", CategoriaDespesa.ALIMENTACAO, LocalDate.now(), 89.95));
		despesas.add(new Despesa("Corte de Cabelo", CategoriaDespesa.CUIDADOS_PESSOAIS, LocalDate.now(), 45.00));
		despesas.add(new Despesa("Combustivel", CategoriaDespesa.VEICULO, LocalDate.now(), 80.00));
		despesas.add(new Despesa("Tênis", CategoriaDespesa.VESTUARIO, LocalDate.now(), 237.00));
		despesas.add(new Despesa("Almoço", CategoriaDespesa.ALIMENTACAO, LocalDate.now(), 30.00));
		despesas.add(new Despesa("Conta de Energia", CategoriaDespesa.MORADIA, LocalDate.now(), 170.00));
		despesas.add(new Despesa("Pagamento da Pós", CategoriaDespesa.EDUCACAO, LocalDate.now(), 850.00));
		despesas.add(new Despesa("Plano de Saúde", CategoriaDespesa.SAUDE, LocalDate.now(), 360.00));

		return despesas;
	}

	@Override
	public String toString() {
		return "DAODespesa [despesas=" + despesas + "]";
	}
}
