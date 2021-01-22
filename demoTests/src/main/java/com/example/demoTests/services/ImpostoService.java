package com.example.demoTests.services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ImpostoService {

    public String getFaixaDeAliquota(BigDecimal rendimento) {
        if (rendimento.doubleValue() < 0) throw new IllegalArgumentException("Rendimento não pode ser negativo");
        else if (rendimento.doubleValue() < 1000) return "ISENTO";
        else if (rendimento.doubleValue() < 5000) return "INTERMEDIARIO";
        else return "MAIOR";
    }

    public List<String> getFaixas() {
        return List.of("ISENTO", "INTERMEDIARIO", "MAIOR");
    }
}
