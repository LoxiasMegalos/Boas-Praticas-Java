package project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;

    private BigDecimal salario;

    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        GerenciaFuncionarios gerenciamento = new GerenciaFuncionarios();
        gerenciamento.adicionaFuncionario();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.salario = novoSalario;
        this.dataUltimoReajuste = LocalDate.now();
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }
}
