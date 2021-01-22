package com.example.demoTests.services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ImpostoAliquotaService {
    public BigDecimal getAliquota(BigDecimal rendimento, String faixaDaAliquota) {
//        Faz de conta que vai ao banco de dados
        return new BigDecimal(12);
    }
}
