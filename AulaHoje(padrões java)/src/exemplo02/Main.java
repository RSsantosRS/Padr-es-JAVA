package exemplo02;

public class Main {
	public static void main(String[] args) {
		FabricaPedido fabricaFisica = new FabricaPedidoFisico();
		Produto produtoFisico = new Produto("Livro Físico", 30.0);
		ItemPedido itemFisico = fabricaFisica.criarItemPedido(produtoFisico, 2);
		Pagamento pagamentoFisico = fabricaFisica.criarPagamento();
		Entrega entregaFisica = fabricaFisica.criarEntrega();
		double totalFisico = itemFisico.getPreco() + entregaFisica.calcularCustoEntrega();
		System.out.println("Total do Pedido Fisico: R$ " + totalFisico);
		pagamentoFisico.processarPagamento(totalFisico);

		FabricaPedido fabricaDigital = new FabricaPedidoDigital();
		Produto produtoDigital = new Produto("E-Book", 20.0);
		ItemPedido itemDigital = fabricaDigital.criarItemPedido(produtoDigital, 2);
		Pagamento pagamentoDigital = fabricaDigital.criarPagamento();
		Entrega entregaDigital = fabricaDigital.criarEntrega();
		double totalDigital = itemDigital.getPreco() + entregaDigital.calcularCustoEntrega();
		System.out.println("Total do Pedido Digital: R$ " + totalDigital);
		pagamentoDigital.processarPagamento(totalDigital);
	}

}
