package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping(value = "/string")
    public List<String> getAllCategoriasEmString() {
        return Arrays.stream(Categoria.values()).map(Categoria::getNome).collect(Collectors.toList());
    }

    @GetMapping(value = "/todas")
    public List<Categoria> getAllCategorias() {
        return Arrays.asList(Categoria.values());
    }
}
