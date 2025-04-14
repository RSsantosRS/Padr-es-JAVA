package ProtoType;

public class ProducaoConfig extends AmbienteConfig {

	public ProducaoConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
		super(url, usuario, senha, timeoutSegundos, logDetalhado);

	}

	@Override
	public void exibirInfo() {
		System.out.println("Ambiente de Produção: ");
		System.out.println("URL: " + getUrl());
		System.out.println("Usuario: " + getUsuario());
		System.out.println("Timeout: " + getTimeoutSegundos() + "s");
		System.out.println(" Log Detalhado: " + isLogDetalhado());
		System.out.println("-----------------------------------");
	}

}
