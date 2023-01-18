import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImpostos calcula = new CalculadoraDeImpostos();
        System.out.println(calcula.calcular(orcamento, new ICMS()));
    }
}
