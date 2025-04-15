package ExemploDecorator;

public class Leite extends AdicionalDecorator {

	public Leite(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + "com leite";
	}

	@Override
	public double getPreco() {
		return bebida.getPreco() + 1.3;
	}

}
