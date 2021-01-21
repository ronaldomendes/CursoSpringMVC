package br.com.impacta.springmvc.gerenciadordespesas.model;

public enum Moeda {
    USD_BRL("USD-BRL", "Dólar Comercial"),
    USDT_BRL("USDT-BRL", "Dólar Turismo"),
    CAD_BRL("CAD-BRL", "Dólar Canadense"),
    AUD_BRL("AUD-BRL", "Dólar Australiano"),
    EUR_BRL("EUR-BRL", "Euro"),
    GBP_BRL("GBP-BRL", "Libra Esterlina"),
    ARS_BRL("ARS-BRL", "Peso Argentino"),
    JPY_BRL("JPY-BRL", "Iene Japonês"),
    CHF_BRL("CHF-BRL", "Franco Suíço"),
    CNY_BRL("CNY-BRL", "Yuan Chinês"),
    YLS_BRL("YLS-BRL", "Novo Shekel Israelense"),
    BTC_BRL("BTC-BRL", "Bitcoin"),
    LTC_BRL("LTC-BRL", "Litecoin"),
    ETH_BRL("ETH-BRL", "Ethereum"),
    XRP_BRL("XRP-BRL", "Ripple");

    private final String id;
    private final String descricao;

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    Moeda(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
