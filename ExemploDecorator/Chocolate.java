package ExemploDecorator;

public class Chocolate extends AdicionalDecorator {

	public Chocolate(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + "com chocolate";
	}

	@Override
	public double getPreco() {
		return bebida.getPreco() + 2.0;
	}

}
