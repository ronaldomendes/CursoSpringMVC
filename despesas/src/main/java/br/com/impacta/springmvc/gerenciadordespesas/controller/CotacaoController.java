package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Cotacao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/despesas/util")
public class CotacaoController {

    @RequestMapping(value = "cotacao/form")
    public String exibeFormCotacao(Model model) {
        model.addAttribute("cotacao", new Cotacao());
        return "exibe-cotacao";
    }

    @RequestMapping(value = "/cotacao")
    public ModelAndView getCotacao(@ModelAttribute Cotacao cotacao) throws JsonMappingException, JsonProcessingException {
        ModelAndView mv = new ModelAndView("exibe-cotacao");

        RestTemplate template = new RestTemplate();
        String url = "https://economia.awesomeapi.com.br/";
        Cotacao[] cotacoes = template.getForObject(url + cotacao.getMoeda().getId(), Cotacao[].class);

        if (cotacoes.length > 0) mv.addObject("cotacao", cotacoes[0]);

        return mv;
    }
}
