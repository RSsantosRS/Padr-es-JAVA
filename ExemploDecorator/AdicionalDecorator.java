package ExemploDecorator;

public abstract class AdicionalDecorator implements Bebida {
	protected Bebida bebida;

	public AdicionalDecorator(Bebida bebida) {
		this.bebida = bebida;

	}

}
