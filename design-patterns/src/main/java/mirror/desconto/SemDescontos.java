package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDescontos extends Desconto{

    public SemDescontos(){
        super(null);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected Boolean descontoAplicavel(Orcamento orcamento) {
        return true;
    }
}
