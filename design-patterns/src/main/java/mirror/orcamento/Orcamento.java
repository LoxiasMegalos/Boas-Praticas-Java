package mirror.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal orcamento;
    private int quantidade;

    public Orcamento(BigDecimal valor, int quantidade){
        this.orcamento = valor;
        this.quantidade = quantidade;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
