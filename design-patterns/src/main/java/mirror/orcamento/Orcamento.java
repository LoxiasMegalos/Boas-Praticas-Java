package mirror.orcamento;

import mirror.orcamento.situacao.EmAnalise;
import mirror.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal orcamento;
    private int quantidade;

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidade){
        this.orcamento = valor;
        this.quantidade = quantidade;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal calculaDescontoExtra(){
        BigDecimal descontoExtra = this.situacao.calculaDescontoExtra(this);
        return descontoExtra;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
}
