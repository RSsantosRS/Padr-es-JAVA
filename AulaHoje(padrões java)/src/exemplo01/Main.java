package exemplo01;

public class Main {
	public static void main(String[] args) {
		Pedido pedidoLoja = new PedidoLojaFisica();
		pedidoLoja.adicionarItem(new Produto("Caderno", 20.0), 2);
		pedidoLoja.adicionarItem(new Produto("Caneta", 3.0), 5);

		System.out.println("Itens no Pedido da Loja Fisica: ");
		for (PedidoItem item : pedidoLoja.getItens()) {
			System.out.println("-" + item.getProduto().getNome() + " x" + item.getQuantidade() + "=>" + item.getPreco());
		}
		System.out.println("Toral: R$ " + pedidoLoja.calcularTotal());
		Pedido pedidoOnline = new PedidoOnline();
		pedidoOnline.adicionarItem(new Produto("Livro", 50.0), 1);
		pedidoOnline.adicionarItem(new Produto("Mouse", 90.0), 2);
		System.out.println("\n Itens no Pedido Online: ");
		for (PedidoItem item : pedidoOnline.getItens()) {
			System.out.println("-" + item.getProduto().getNome() + " x" + item.getQuantidade() + "=>" + item.getPreco());
		}
		System.out.println("Total: R$" + pedidoOnline.calcularTotal());
	}

}
