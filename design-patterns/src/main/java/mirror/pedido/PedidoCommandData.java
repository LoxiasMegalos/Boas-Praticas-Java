package mirror.pedido;

import java.math.BigDecimal;

public class PedidoCommandData {

    private String cliente;
    private BigDecimal valor;
    private int quantidadeItems;

    public PedidoCommandData(String cliente, BigDecimal valor, int quantidadeItems) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidadeItems = quantidadeItems;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }
}
