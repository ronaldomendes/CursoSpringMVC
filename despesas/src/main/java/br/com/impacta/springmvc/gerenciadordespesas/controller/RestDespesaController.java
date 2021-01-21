package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Categoria;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api/despesas")
public class RestDespesaController {

    private DespesaRepository repository;

    @Autowired
    public void setRepository(DespesaRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public ResponseEntity<List<Despesa>> getAllDespesas() {
        List<Despesa> despesas = repository.findAll();
        return ResponseEntity.ok().body(despesas);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Despesa> getDespesaById(@PathVariable Long id) {
        return repository.findById(id)
                .map(despesa -> ResponseEntity.ok().body(despesa))
                .orElse(ResponseEntity.status(404).build());
    }

    @GetMapping(value = "/categorias/{nome_categoria}")
    public ResponseEntity<List<Despesa>> getDespesaByCategoria(@PathVariable Categoria nome_categoria) {
        List<Despesa> despesas = repository.findByCategoria(nome_categoria);
        return ResponseEntity.ok().body(despesas);
    }

    @PostMapping()
    public ResponseEntity<Void> insertDespesa(@Valid @RequestBody Despesa despesa) {
        despesa = repository.save(despesa);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(despesa.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
