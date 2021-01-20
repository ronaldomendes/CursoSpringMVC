package br.com.impacta.springmvc.gerenciadordespesas.repository;

import br.com.impacta.springmvc.gerenciadordespesas.model.Categoria;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
    List<Despesa> findByDescricaoContaining(String descricao);
    List<Despesa> findByCategoria(Categoria categoria);
}
