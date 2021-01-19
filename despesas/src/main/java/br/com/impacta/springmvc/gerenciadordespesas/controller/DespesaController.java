package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/despesas")
public class DespesaController {

    @Autowired
    private DespesaRepository repository;

    @RequestMapping(value = "/form")
    public String exibeCadastro(Model model) {
        model.addAttribute("despesa", new Despesa());
        return "cadastro-despesa";
    }

    @RequestMapping(value = "/salvar")
    public ModelAndView registra(@ModelAttribute Despesa despesa, Errors errors) {
        ModelAndView mv = new ModelAndView("cadastro-despesa");

        if (errors.hasErrors()) return mv;

        repository.save(despesa);
        mv.addObject("mensagem", "Despesa salva com sucesso");
        return mv;
    }

    @GetMapping()
    public ModelAndView despesas() {
        List<Despesa> listaDespesas = repository.findAll();
        ModelAndView mv = new ModelAndView("listagem-despesas");
        mv.addObject("despesas", listaDespesas);
        return mv;
    }
}
