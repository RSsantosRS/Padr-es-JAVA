package exemplo02;

public class PagamentoFisico implements Pagamento {
	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento fìsico de R$" + valor);
	}

}
