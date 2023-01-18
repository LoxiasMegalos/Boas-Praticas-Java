package mirror.imposto;


import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularImpostos {

    public BigDecimal calcularImpostos(Orcamento orcamento, TipoImposto imposto){
        return imposto.calcular(orcamento.getOrcamento());
    }
}
