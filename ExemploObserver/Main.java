package ExemploObserver;

public class Main {
	public static void main(String[] args) {
		SensorTemperatura sensor = new SensorTemperatura();
		ExibidorTemperatura exibidor = new ExibidorTemperatura();

		sensor.adicionarObservador(exibidor);
		sensor.setTemperatura(22.5);
		sensor.setTemperatura(25.0);
	}
}
