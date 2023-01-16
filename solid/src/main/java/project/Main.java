package project;

import project.model.Cargo;
import project.model.Funcionario;
import project.model.GerenciaFuncionarios;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        GerenciaFuncionarios gerencia = new GerenciaFuncionarios();
        System.out.println(gerencia.getQuantidadeFuncionarios());
        Funcionario novoFuncionario = new Funcionario("Murillo", "12345678911", Cargo.ANALISTA, new BigDecimal(5000));
        System.out.println(gerencia.getQuantidadeFuncionarios());
    }
}
