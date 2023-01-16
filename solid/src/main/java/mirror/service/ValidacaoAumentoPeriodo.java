package mirror.service;

import mirror.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoAumentoPeriodo implements  ValidacoesAumento{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataReajuste();
        LocalDate dataAtual = LocalDate.now();

        long quantidadeDeMeses = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

        if(quantidadeDeMeses < 6){
            throw new RuntimeException("Um reajuste só pode acontecer no minimo de 6 meses");
        }
    }
}
