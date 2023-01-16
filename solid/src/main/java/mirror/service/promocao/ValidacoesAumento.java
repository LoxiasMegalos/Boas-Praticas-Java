package mirror.service.promocao;

import mirror.Funcionario;

import java.math.BigDecimal;

public interface ValidacoesAumento {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
