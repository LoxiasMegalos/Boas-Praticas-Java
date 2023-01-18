package mirror.imposto;

import java.math.BigDecimal;

public class ISS implements TipoImposto{
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.075"));
    }
}
