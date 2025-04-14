package exemplo03;

public class XlsNotaNegociacaoBuilder implements NotaNegociacaoBuilder {
	private NotaNegociacao nota;

	public XlsNotaNegociacaoBuilder() {
		this.nota = new NotaNegociacao();
	}

	@Override
	public void buildCabecalho() {
		nota.adicionarConteudo("XLS: Cabeçalho da nota");
		// TODO Auto-generated method stub

	}

	@Override
	public void buildOperacoes() {
		nota.adicionarConteudo("XLS: Lista de Operações");
		// TODO Auto-generated method stub

	}

	@Override
	public void buildSumario() {
		nota.adicionarConteudo("XLS: Sumário com totais e taxas");
		// TODO Auto-generated method stub

	}

	@Override
	public NotaNegociacao getNota() {
		// TODO Auto-generated method stub
		return nota;
	}

}
