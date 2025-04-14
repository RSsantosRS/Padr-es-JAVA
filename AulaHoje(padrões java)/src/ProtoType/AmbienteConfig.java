package ProtoType;

public abstract class AmbienteConfig implements Cloneable {
	private String url;
	private String usuario;
	private String senha;
	private int timeoutSegundos;
	private boolean logDetalhado;

	public AmbienteConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
		this.url = url;
		this.usuario = usuario;
		this.senha = senha;
		this.timeoutSegundos = timeoutSegundos;
		this.logDetalhado = logDetalhado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTimeoutSegundos() {
		return timeoutSegundos;
	}

	public void setTimeoutSegundos(int timeoutSegundos) {
		this.timeoutSegundos = timeoutSegundos;
	}

	public boolean isLogDetalhado() {
		return logDetalhado;
	}

	public void setLogDetalhado(boolean logDetalhado) {
		this.logDetalhado = logDetalhado;
	}

	@Override
	public AmbienteConfig clone() {
		try {
			return (AmbienteConfig) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError("Clonagem não Suportada", e);
		}
	}

	public abstract void exibirInfo();

}
