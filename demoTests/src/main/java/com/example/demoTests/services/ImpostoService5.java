package com.example.demoTests.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ImpostoService5 {

    private ImpostoAliquotaService service;

    @Autowired
    public void setService(ImpostoAliquotaService service) {
        this.service = service;
    }

    public String getFaixaDeAliquota(BigDecimal rendimento) {
        if (rendimento.doubleValue() < 0) throw new IllegalArgumentException("Rendimento não pode ser negativo");
        else if (rendimento.doubleValue() < 1000) return "ISENTO";
        else if (rendimento.doubleValue() < 5000) return "INTERMEDIARIO";
        else return "MAIOR";
    }

    public BigDecimal calculaAliquota(BigDecimal rendimento) {
        BigDecimal aliquota = service.getAliquota(rendimento, getFaixaDeAliquota(rendimento));
        BigDecimal imposto = aliquota.multiply(rendimento);
        logParaAuditoria(rendimento, imposto);
        return imposto;
    }

    protected void logParaAuditoria(BigDecimal rendimento, BigDecimal imposto) {
//        simulando o acesso a uma api externa
    }
}
