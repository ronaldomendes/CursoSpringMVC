package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/despesa")
public class DespesaController {

    @Autowired
    private DespesaRepository repository;

    @RequestMapping(value = "/form")
    public String exibeCadastro(Model model) {
        model.addAttribute("despesa", new Despesa());
        return "cadastro-despesa";
    }

    @RequestMapping(value = "/salvar")
    public ModelAndView registra(@ModelAttribute Despesa despesa) {
        ModelAndView mv = new ModelAndView("cadastro-despesa");
        repository.save(despesa);

        mv.addObject("mensagem", "Despesa salva com sucesso");
        mv.addObject("despesa", new Despesa());
        return mv;
    }
}
