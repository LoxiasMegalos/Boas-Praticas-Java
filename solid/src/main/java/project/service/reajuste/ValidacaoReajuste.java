package project.service.reajuste;

import project.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void validar(Funcionario funcionario, BigDecimal aumento);

}
