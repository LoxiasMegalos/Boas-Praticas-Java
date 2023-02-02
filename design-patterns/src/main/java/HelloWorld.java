import loja.desconto.CalculadoraDeDescontos;
import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.orcamento.Orcamento;
import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
import loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Orcamento orcamento = new Orcamento(new BigDecimal(100), 1);
        Orcamento orcamento2 = new Orcamento(new BigDecimal(100), 6);
        Orcamento orcamento3 = new Orcamento(new BigDecimal(600), 3);
        CalculadoraDeImpostos calcula = new CalculadoraDeImpostos();
        System.out.println(calcula.calcular(orcamento, new ICMS()));
        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        System.out.println(descontos.calcular(orcamento));
        System.out.println(descontos.calcular(orcamento2));
        System.out.println(descontos.calcular(orcamento3));

        mirror.orcamento.Orcamento orcamento52 = new mirror.orcamento.Orcamento(new BigDecimal(100), 12);
        System.out.println(orcamento52.calculaDescontoExtra());
        orcamento52.aprovar();
        System.out.println(orcamento52.calculaDescontoExtra());
        orcamento52.finalizar();
        System.out.println(orcamento52.calculaDescontoExtra());
        //orcamento52.reprovar();

        //Pedido pedido = new Pedido("Murillo", LocalDateTime.now(), orcamento2);
        //System.out.println(pedido.getOrcamento().getSituacao());

        GeraPedido gerador = new GeraPedido("Murillo", orcamento2.getValor(), orcamento2.getQuantidadeItens());
        GeraPedidoHandler handler = new GeraPedidoHandler(/*Dependencias*/);
        handler.execute(gerador);
    }
}
