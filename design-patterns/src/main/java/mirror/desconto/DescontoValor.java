package mirror.desconto;

import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor extends Desconto{

    public DescontoValor(Desconto desconto){
        super(desconto);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getOrcamento().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getOrcamento().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
}
