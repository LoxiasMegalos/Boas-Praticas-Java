package mirror;

import mirror.desconto.CalculaDescontos;
import mirror.imposto.CalcularImpostos;
import mirror.imposto.ISS;
import mirror.orcamento.Orcamento;
import mirror.pedido.PedidoCommandData;
import mirror.pedido.PedidoCommandHandler;
import mirror.pedido.acao.EnviarInfoPedidoPorEmail;
import mirror.pedido.acao.PedidoDandoMortalPraTras;
import mirror.pedido.acao.SalvarNovoPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    //Impostos - Strategy
    //Descontos - Chain Responsibility e Template Method
    //Desconto Extra - State
    //Pedidos - Command
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
        CalcularImpostos calculadora = new CalcularImpostos();
        System.out.println(calculadora.calcularImpostos(orcamento, new ISS()));
        System.out.printf("%.2f\n",calculadora.calcularImpostos(orcamento, new ISS()));
        CalculaDescontos descontos = new CalculaDescontos();
        System.out.println(descontos.calcular(orcamento));

        PedidoCommandData data = new PedidoCommandData("Murillo", orcamento.getOrcamento(), orcamento.getQuantidade());
        PedidoCommandHandler handler = new PedidoCommandHandler(
                Arrays.asList(
                        new EnviarInfoPedidoPorEmail(),
                        new SalvarNovoPedidoNoBanco(),
                        new PedidoDandoMortalPraTras()
                )
        );
        handler.execute(data);
    }
}
