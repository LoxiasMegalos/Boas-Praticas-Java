package project.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {



    private DadosPessoais dadosPessoais;
    //private Cargo cargo;

    //private BigDecimal salario;

    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario){
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        //this.cargo = cargo;
        //this.salario = salario;
        GerenciaFuncionarios gerenciamento = new GerenciaFuncionarios();
        gerenciamento.adicionaFuncionario();
    }

    public String getNome() {
        return this.dadosPessoais.getNome();
    }

    public void setNome(String novoNome) {
        this.dadosPessoais.setNome(novoNome);
    }

    public BigDecimal getSalario() {
        return this.dadosPessoais.getSalario();
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public Cargo getCargo() {
        return this.dadosPessoais.getCargo();
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }
}
