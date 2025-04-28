package PadraoProxy;

import java.time.LocalDateTime;

public class CotacaoProxy implements CotacaoService {
	private double cache;
	private LocalDateTime ultimaConsulta;
	private CotacaoAPI cotacaoReal;

	public CotacaoProxy() {
		this.cotacaoReal = new CotacaoAPI();
		this.ultimaConsulta = null;
	}

	@Override
	public double getCotacaoDolar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
