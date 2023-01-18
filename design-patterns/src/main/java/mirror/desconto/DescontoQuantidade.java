package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidade extends Desconto{

    public DescontoQuantidade(Desconto desconto){
        super(desconto);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return orcamento.getOrcamento().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected Boolean descontoAplicavel(Orcamento orcamento) {
        return orcamento.getQuantidade() > 5;
    }
}
