package br.com.impacta.springmvc.gerenciadordespesas.controller;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repository.DespesaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {DespesaController.class})
public class DespesaControllerTest {

    @Autowired
    private DespesaController controller;

    @MockBean
    private DespesaRepository repository;

    @Test
    public void consultaListaDespesas(){
        when(repository.findAll()).thenReturn(new ArrayList<Despesa>());
        ModelAndView mv = controller.despesas(Mockito.anyString());
        List<Despesa> despesas = (List<Despesa>) mv.getModel().get("despesas");
        assertTrue(despesas.isEmpty());
    }
}
