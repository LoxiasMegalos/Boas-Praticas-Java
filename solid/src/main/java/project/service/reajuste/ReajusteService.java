package project.service.reajuste;

import project.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }
    public void reajustarSalarioDoFuncionariol(Funcionario funcionario, BigDecimal aumento){

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }
}
