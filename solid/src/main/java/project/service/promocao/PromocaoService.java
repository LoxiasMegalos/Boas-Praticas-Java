package project.service.promocao;


import project.model.Cargo;
import project.model.Funcionario;
import project.model.ValidacaoException;

public class PromocaoService {

    public void promover(Funcionario funcionario, Boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == funcionario.getCargo()){
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else{
            throw new ValidacaoException("Funcionário não bateu a meta");
        }
    }
}
