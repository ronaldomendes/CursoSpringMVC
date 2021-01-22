package com.example.demoTests.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class ImpostoServiceTest {

    private final ImpostoService service = new ImpostoService();

    @Test
    public void seExceptionEhLancadaParaValorMenorQueZero() {
        assertThrows(IllegalArgumentException.class, () -> service.getFaixaDeAliquota(new BigDecimal(-1)));
    }

    @Test
    public void seAliquotaIsentoParaValorMenorQue1000() {
        final String faixaImposto = service.getFaixaDeAliquota(new BigDecimal(500));
        assertTrue(faixaImposto.equalsIgnoreCase("isento"));
    }

    @Test
    public void seAliquotaIntermediarioParaValorMenorQue5000() {
        final String faixaImposto = service.getFaixaDeAliquota(new BigDecimal(4000));
        assertTrue(faixaImposto.equalsIgnoreCase("intermediario"));
    }

    @Test
    public void seAliquotaMaiorParaValorMaiorQue5000() {
        final String faixaImposto = service.getFaixaDeAliquota(new BigDecimal(10000));
        assertTrue(faixaImposto.equalsIgnoreCase("maior"));
    }

    @Test
    public void seTodasAsFaixasEstaoPresentes() {
        final List<String> todasAsFaixas = service.getFaixas();
        assertFalse(todasAsFaixas.isEmpty());
        assertArrayEquals(todasAsFaixas.toArray(), new Object[]{"ISENTO", "INTERMEDIARIO", "MAIOR"});
    }
}
