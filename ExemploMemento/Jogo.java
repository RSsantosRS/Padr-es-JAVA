package ExemploMemento;

public class Jogo {
	private String posicao;

	public void moverPara(String novaPosicao) {
		this.posicao = novaPosicao;
	}

	public EstadoJogo salvar() {
		return new EstadoJogo(posicao);
	}

	public void restaurar(EstadoJogo estado) {
		this.posicao = estado.getPosicao();
	}

	public String getPosicao() {
		return posicao;
	}

}
