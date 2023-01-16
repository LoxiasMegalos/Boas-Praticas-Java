package project.service.reajuste;

import project.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void validar(Funcionario funcionario, BigDecimal aumento);

}
