package mirror.service.aumento;

import mirror.Cargo;
import mirror.Funcionario;
import mirror.ValidacaoException;

public class PromoveService {

    public void validaPromocao(Funcionario funcionario, Boolean prontoPromocao){
        if(funcionario.getCargo() == Cargo.GERENTE){
            throw new ValidacaoException("Voce ja é um gerente, parabens");
        }
        Cargo cargoAtual = funcionario.getCargo();
        if(prontoPromocao){
            Cargo proximoCargo = cargoAtual.getProximoCargo();
            funcionario.promove(proximoCargo);
        } else {
            throw new ValidacaoException("Bata as metas na proxima vez!");
        }
    }
}
