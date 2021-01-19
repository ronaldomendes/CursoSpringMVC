package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
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
        mv.addObject("despesa", new Despesa());
        return mv;
    }

    @GetMapping()
    public ModelAndView despesas(@RequestParam(defaultValue = "") String descricao) {
        ModelAndView mv = new ModelAndView("listagem-despesas");
        List<Despesa> listaDespesas = repository.findByDescricaoContaining(descricao);
        mv.addObject("despesas", listaDespesas);
        return mv;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    public String excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/despesas";
    }

    @RequestMapping(value = "/form/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Despesa despesa = repository.getOne(id);
        model.addAttribute("despesa", despesa);
        return "cadastro-despesa";
    }
}
