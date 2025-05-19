package ExemploObserver;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
	private double temperatura;
	private List<Observador> observadores;

	public SensorTemperatura() {
		observadores = new ArrayList<>();
	}

	public void adicionarObservador(Observador o) {
		observadores.add(o);
	}

	public void setTemperatura(double temp) {
		this.temperatura = temp;
		notificarObservadores();
	}

	private void notificarObservadores() {
		for (Observador o : observadores) {
			o.atualizar(temperatura);
		}
	}

}
