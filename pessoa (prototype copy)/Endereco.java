package pessoa;

public class Endereco {
	private String rua;

	public Endereco(String rua) {
		this.rua = rua;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + "]";
	}
	
	
	
	
}
