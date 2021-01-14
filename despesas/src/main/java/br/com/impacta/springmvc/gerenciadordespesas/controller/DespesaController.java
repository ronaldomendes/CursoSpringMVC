package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/despesas")
public class DespesaController {

    @GetMapping(value = "/form")
    public String exibeCadastro(Model model) {
        model.addAttribute("despesa", new Despesa());
        return "cadastro-despesa";
    }

    @GetMapping(value = "/salvar")
    public String registra(@ModelAttribute Despesa despesa) {
        System.out.println(despesa);
        return "";
    }
}
