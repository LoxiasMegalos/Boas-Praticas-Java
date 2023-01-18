package mirror.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal orcamento;

    public Orcamento(BigDecimal valor){
        this.orcamento = valor;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }
}
