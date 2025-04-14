package exemplo03;

public class XmlNotaNegociacaoBuilder implements NotaNegociacaoBuilder {
	private NotaNegociacao nota;

	public XmlNotaNegociacaoBuilder() {
		this.nota = new NotaNegociacao();
	}

	@Override
	public void buildCabecalho() {
		nota.adicionarConteudo("<cabeçalho> XML: Cabeçalho da nota</cabeçalho>");
		// TODO Auto-generated method stub

	}

	@Override
	public void buildOperacoes() {
		nota.adicionarConteudo("<operações> XML: Lista de Operações </operações>");
		// TODO Auto-generated method stub

	}

	@Override
	public void buildSumario() {
		nota.adicionarConteudo("<sumario> XML: Sumário com totais e taxas</sumario>");
		// TODO Auto-generated method stub

	}

	@Override
	public NotaNegociacao getNota() {
		// TODO Auto-generated method stub
		return nota;
	}

}
