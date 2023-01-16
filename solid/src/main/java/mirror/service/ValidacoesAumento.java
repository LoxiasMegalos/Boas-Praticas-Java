package mirror.service;

import mirror.Funcionario;

import java.math.BigDecimal;

public interface ValidacoesAumento {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
