package mirror.service.promocao;

import mirror.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacoesAumento> validacoes;

    public ReajusteService(List<ValidacoesAumento> valids){
        this.validacoes = valids;
    }
    public void reajustaSalarioFuncionario(Funcionario funcionario, BigDecimal reajuste){

        this.validacoes.forEach(x -> x.validar(funcionario, reajuste));

        funcionario.reajustaSalario(funcionario.getSalario().add(reajuste));
    }
}
