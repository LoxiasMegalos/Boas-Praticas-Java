package mirror.service;

import mirror.Funcionario;
import mirror.ValidacaoException;

import java.math.BigDecimal;

public class ValidacaoAumentoPercentual implements ValidacoesAumento{

    @Override
    public void validar(Funcionario funcionario, BigDecimal reajuste) {
        BigDecimal porcentagemReajuste = reajuste.divide(funcionario.getSalario());
        System.out.println(porcentagemReajuste);
        if(porcentagemReajuste.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidacaoException("Reajuste deve ser no maximo de 40%");
        }
    }
}
