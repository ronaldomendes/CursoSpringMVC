package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Cep;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
@RequestMapping(value = "/cep")
public class CepController {

    @RequestMapping(value = "/util/form")
    public String exibeFormCep(Model model) {
        model.addAttribute("cep", new Cep());
        return "exibe-cep";
    }

    @RequestMapping(value = "/util/consulta")
    public ModelAndView getCep(@ModelAttribute Cep cep) throws JsonMappingException, JsonProcessingException {
        ModelAndView mv = new ModelAndView("exibe-cep");

        RestTemplate template = new RestTemplate();
        String url = "https://cep.awesomeapi.com.br/json/";
        Cep ceps = template.getForObject(url + cep.getCep(), Cep.class);

        if (Objects.nonNull(ceps)) mv.addObject("cep", ceps);

        return mv;
    }
}
