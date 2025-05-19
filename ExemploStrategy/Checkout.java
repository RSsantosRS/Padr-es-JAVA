package ExemploStrategy;

public class Checkout {
	private FreteStrategy frete;

	public void setFrete(FreteStrategy frete) {
		this.frete = frete;
	}

	public double calcularFrete(double peso) {
		if (frete == null) {
			throw new IllegalStateException("Estratégia do frete não definida! ");
		}
		return frete.calcular(peso);
	}

}
