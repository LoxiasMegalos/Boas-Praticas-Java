package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculaDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        DescontoQuantidade desconto = new DescontoQuantidade(
                new DescontoValor(
                        new SemDescontos()
                )
        );

        return desconto.calcula(orcamento);
    }
}
