package mirror.imposto;

import java.math.BigDecimal;

public class ICMS implements TipoImposto{
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
