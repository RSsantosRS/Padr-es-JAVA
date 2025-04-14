package exemplo03;

public class NotaNegociacaoDirector {
	private NotaNegociacaoBuilder builder;

	public NotaNegociacaoDirector(NotaNegociacaoBuilder builder) {
		this.builder = builder;
	}

	public void construirNota() {
		builder.buildCabecalho();
		builder.buildOperacoes();
		builder.buildSumario();
	}

}
