package ExemploMemento;

public class MainMemento {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		ControleJogo controle = new ControleJogo();

		jogo.moverPara("A1");
		controle.salvar(jogo);

		jogo.moverPara("B2");
		controle.salvar(jogo);

		jogo.moverPara("C3");

		System.out.println("Posição atual: " + jogo.getPosicao());
		controle.desfazer(jogo);
		System.out.println("Após desfazer: " + jogo.getPosicao());
		controle.desfazer(jogo);
		System.out.println("Após desfazer novamente: " + jogo.getPosicao());
	}

}
