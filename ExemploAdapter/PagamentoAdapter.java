package ExemploAdapter;

public class PagamentoAdapter implements Pagamento {

	private SistemaAntigo sistema;

	@Override
	public void pagar(double valor) {
		sistema.realizarPagamento(valor);
		// TODO Auto-generated method stub

	}

}
