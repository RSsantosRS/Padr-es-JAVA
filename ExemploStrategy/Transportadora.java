package ExemploStrategy;

public class Transportadora implements FreteStrategy {

	public double calcular(double peso) {
		return peso * 2.0;
	}

}
