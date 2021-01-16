package br.com.impacta.springmvc.gerenciadordespesas.repository;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
