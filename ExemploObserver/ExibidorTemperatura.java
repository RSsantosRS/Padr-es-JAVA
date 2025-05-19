package ExemploObserver;

public class ExibidorTemperatura implements Observador {

	public void atualizar(double temperatura) {
		System.out.println("Temperatura atual: " + temperatura + "°C");
	}

}
