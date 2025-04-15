package ExemploDecorator;

public class Cafe implements Bebida {

	@Override
	public String getDescricao() {
		return "Cafe";
	}

	@Override
	public double getPreco() {
		return 2.5;
	}

}
