package exemplo02;

public class ItemPedidoDigital implements ItemPedido {
	private Produto produto;
	private int quantidade;

	public ItemPedidoDigital(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public Produto getProduto() {
		return produto;
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public double getPreco() {
		return produto.getPreco() * quantidade;
	}

}
