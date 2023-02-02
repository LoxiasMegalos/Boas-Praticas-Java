package mirror.pedido.acao;

import mirror.pedido.Pedido;

public class EnviarInfoPedidoPorEmail implements PedidoOberserver{

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Enviando pedido do cliente: " + pedido.getCliente()+ " Por e-mail");
    }
}
