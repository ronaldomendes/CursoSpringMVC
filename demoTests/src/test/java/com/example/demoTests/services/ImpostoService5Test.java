package com.example.demoTests.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ImpostoService5.class})
public class ImpostoService5Test {

    @SpyBean
    private ImpostoService5 service;

    @MockBean
    private ImpostoAliquotaService impostoAliquotaService;

    @Test
    public void calculaImpostoCorretoDoRendimento() {
        final BigDecimal rendimento = new BigDecimal(3000);
        when(impostoAliquotaService.getAliquota(Mockito.any(BigDecimal.class), Mockito.anyString()))
                .thenReturn(new BigDecimal("0.5"));

        doNothing().when(service).logParaAuditoria(Mockito.any(BigDecimal.class), Mockito.any(BigDecimal.class));

        final BigDecimal imposto = service.calculaAliquota(rendimento);
        assertEquals(rendimento.multiply(new BigDecimal("0.5")), imposto);
    }
}
