package com.example.demoTests.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ImpostoService4.class})
public class ImpostoService4Test {

    @Autowired
    private final ImpostoService4 service = new ImpostoService4();

    @MockBean
    private ImpostoAliquotaService impostoAliquotaService;

    @Test
    public void calculaImpostoCorretoDoRendimento() {
        final BigDecimal rendimento = new BigDecimal(3000);
        when(impostoAliquotaService.getAliquota(Mockito.any(BigDecimal.class), Mockito.anyString()))
                .thenReturn(new BigDecimal("0.5"));

        final BigDecimal imposto = service.calculaAliquota(rendimento);
        assertEquals(rendimento.multiply(new BigDecimal("0.5")), imposto);
    }
}
