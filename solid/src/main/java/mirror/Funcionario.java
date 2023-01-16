package mirror;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {

    private String nome;
    private String cpf;

    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void reajustaSalario(BigDecimal aumento){
        this.salario = aumento;
        this.dataReajuste = LocalDate.now();
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public LocalDate getDataReajuste() {
        return dataReajuste;
    }
}
