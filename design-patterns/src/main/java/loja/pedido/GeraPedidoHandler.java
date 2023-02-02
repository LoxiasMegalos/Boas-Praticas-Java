package loja.pedido;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    //Construtor com injecao de dependencia: repository, service, etc.
    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }



    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        acoes.forEach( a -> a.executarAcao(pedido));

    }

}
