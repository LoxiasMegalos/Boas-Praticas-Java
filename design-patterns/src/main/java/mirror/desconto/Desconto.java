package mirror.desconto;


import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto desconto){
        this.proximo = desconto;
    }

    protected abstract BigDecimal realizaCalculo(Orcamento orcamento);
    protected abstract Boolean descontoAplicavel(Orcamento orcamento);

    public BigDecimal calcula(Orcamento orcamento) {
        if(descontoAplicavel(orcamento)){
            return realizaCalculo(orcamento);
        }
        return proximo.calcula(orcamento);
    }
}
