package mirror.pedido;

import mirror.orcamento.Orcamento;

import java.time.LocalDateTime;

public class PedidoCommandHandler {

    public void execute(PedidoCommandData data){
        Orcamento orcamento = new Orcamento(data.getValor(), data.getQuantidadeItems());
        Pedido pedido = new Pedido(data.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Executa comando 1");
        System.out.println("Executa comando 2");
    }

}
