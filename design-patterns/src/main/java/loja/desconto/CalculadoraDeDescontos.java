package loja.desconto;



import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {



    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisQueCincoItens(
                new DescontoValorMaior(
                        new SemDesconto()
                )
        );
        return desconto.efetuarCalculo(orcamento);
    }
}
