package exemplo03;

public interface NotaNegociacaoBuilder {

	void buildCabecalho();

	void buildOperacoes();

	void buildSumario();

	NotaNegociacao getNota();
}
