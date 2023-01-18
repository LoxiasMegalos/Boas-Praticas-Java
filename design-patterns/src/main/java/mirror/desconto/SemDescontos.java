package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDescontos extends Desconto{

    public SemDescontos(){
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
