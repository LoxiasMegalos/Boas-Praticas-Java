package mirror.pedido;

import mirror.orcamento.Orcamento;
import mirror.pedido.acao.PedidoOberserver;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoCommandHandler {

    private List<PedidoOberserver> acoes;

    public PedidoCommandHandler(List<PedidoOberserver> acoes){
        this.acoes = acoes;
    }

    public void execute(PedidoCommandData data){
        Orcamento orcamento = new Orcamento(data.getValor(), data.getQuantidadeItems());
        Pedido pedido = new Pedido(data.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executaAcao(pedido));
    }

}
