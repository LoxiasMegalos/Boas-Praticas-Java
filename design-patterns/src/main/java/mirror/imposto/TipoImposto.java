package mirror.imposto;

import java.math.BigDecimal;

public interface TipoImposto {
    BigDecimal calcular(BigDecimal valor);
}
