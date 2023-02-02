package mirror.pedido.acao;

import mirror.pedido.Pedido;

public class PedidoDandoMortalPraTras implements PedidoOberserver{

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Pedido do cliente: " + pedido.getCliente()+ " Dando mortal pra tras");
    }
}
