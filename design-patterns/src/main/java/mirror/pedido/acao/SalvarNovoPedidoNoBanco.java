package mirror.pedido.acao;

import mirror.pedido.Pedido;

public class SalvarNovoPedidoNoBanco implements PedidoOberserver{

    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Salvando Pedido do cliente: " + pedido.getCliente()+ " No banco de dados");
    }
}
