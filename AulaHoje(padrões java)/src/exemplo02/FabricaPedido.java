package exemplo02;

public interface FabricaPedido {
	ItemPedido criarItemPedido(Produto produto, int quantidade);

	Pagamento criarPagamento();

	Entrega criarEntrega();

}
