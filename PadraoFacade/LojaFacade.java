package PadraoFacade;

public class LojaFacade {

	private Estoque estoque;
	private Pagamento pagamento;
	private Envio envio;

	public void comprarFilme() {
		if (estoque.verificarDisponibilidade()) {
			pagamento.processarPagamento();
			envio.enviar();
		}
	}

}
