package project;

public class GerenciaFuncionarios {

    private static long quantidadeFuncionarios = 0;

    public void adicionaFuncionario(){
        quantidadeFuncionarios += 1;
    }

    public long getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

}
