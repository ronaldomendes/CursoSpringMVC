package com.example.demo.controller;

import com.example.demo.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = "/despesas")
    public String home() {
        return "pagina-inicial-despesas";
    }

    @GetMapping(value = "/categoria-upper")
    public String exibirCategoria(@RequestParam String categoria, Model model) {
        String resultado = "Categoria informada: " + categoria.toUpperCase();
        model.addAttribute("mensagem", resultado);
        return "exibe-categoria";
    }

    @GetMapping(value = "/aluno/form")
    public String exibeFormulario(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno-form";
    }

    @GetMapping(value = "/aluno/registra")
    public String registra(@ModelAttribute Aluno aluno) {
        return "confirmacao-aluno";
    }
}
