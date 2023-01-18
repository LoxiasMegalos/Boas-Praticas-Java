package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor extends Desconto{

    public DescontoValor(Desconto desconto){
        super(desconto);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return orcamento.getOrcamento().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected Boolean descontoAplicavel(Orcamento orcamento) {
        return orcamento.getOrcamento().compareTo(new BigDecimal("500")) > 0;
    }
}
