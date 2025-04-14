package exemplo02;

public class FabricaPedidoFisico implements FabricaPedido {
	@Override
	public ItemPedido criarItemPedido(Produto produto, int quantidade) {
		return new ItemPedidoFisico(produto, quantidade);
	}
	@Override
	public Pagamento criarPagamento() {
		return new PagamentoFisico();
	}
	
	@Override
	public Entrega criarEntrega() {
		return new EntregaFisica(15.0);
	}

}
