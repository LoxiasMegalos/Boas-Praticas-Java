package mirror.model;

import mirror.Cargo;

import java.math.BigDecimal;

public class Terceiro {

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceiro(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa){
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais(){
        return dadosPessoais;
    }
}
