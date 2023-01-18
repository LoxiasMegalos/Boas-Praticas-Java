package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaior extends Desconto {

    public DescontoValorMaior(Desconto proximo){
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }

}
