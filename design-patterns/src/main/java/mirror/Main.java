package mirror;

import mirror.desconto.CalculaDescontos;
import mirror.imposto.CalcularImpostos;
import mirror.imposto.ISS;
import mirror.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
        CalcularImpostos calculadora = new CalcularImpostos();
        System.out.println(calculadora.calcularImpostos(orcamento, new ISS()));
        System.out.printf("%.2f\n",calculadora.calcularImpostos(orcamento, new ISS()));
        CalculaDescontos descontos = new CalculaDescontos();
        System.out.println(descontos.calcular(orcamento));
    }
}
