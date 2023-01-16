package mirror;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Funcionario f = new Funcionario("Murillo", "123", Cargo.ANALISTA, new BigDecimal(100));
        //ReajusteService service = new ReajusteService();
        //service.reajustaSalarioFuncionario(f, new BigDecimal(41));
        //service.reajustaSalarioFuncionario(f, new BigDecimal(40));
        System.out.println(f.getSalario());
    }
}
