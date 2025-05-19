package ExemploMemento;

import java.util.Stack;

public class ControleJogo {
	private Stack<EstadoJogo> historico = new Stack<>();

	public void salvar(Jogo jogo) {
		historico.push(jogo.salvar());
	}

	public void desfazer(Jogo jogo) {
		if (!historico.isEmpty()) {
			EstadoJogo estadoAnterior = historico.pop();
			jogo.restaurar(estadoAnterior);
		}
	}

}
