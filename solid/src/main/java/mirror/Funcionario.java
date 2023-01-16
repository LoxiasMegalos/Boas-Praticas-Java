package mirror;


import mirror.model.DadosPessoais;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {


    private DadosPessoais dadosPessoais;
    private LocalDate dataReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario){
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void reajustaSalario(BigDecimal aumento){
        dadosPessoais.setSalario(aumento);
        this.dataReajuste = LocalDate.now();
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public LocalDate getDataReajuste() {
        return dataReajuste;
    }

    public void promove(Cargo novoCargo){
        this.dadosPessoais.setCargo(novoCargo);
    }
}
