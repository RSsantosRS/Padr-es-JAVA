package ExemploStrategy;

public class Main {
	public static void main(String[] args) {
		Checkout checkout = new Checkout();

		double peso = 10.0;

		// Usando Sedex
		checkout.setFrete(new Sedex());
		System.out.println("Frete Sedex: R$ " + checkout.calcularFrete(peso));

		// Usando PAC
		checkout.setFrete(new PAC());
		System.out.println("Frete PAC: R$ " + checkout.calcularFrete(peso));

		// Usando Transportadora
		checkout.setFrete(new Transportadora());
		System.out.println("Frete Transportadora: R$ " + checkout.calcularFrete(peso));
	}
}
