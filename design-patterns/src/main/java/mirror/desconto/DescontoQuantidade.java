package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidade extends Desconto{

    public DescontoQuantidade(Desconto desconto){
        super(desconto);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidade() > 5){
            return orcamento.getOrcamento().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
