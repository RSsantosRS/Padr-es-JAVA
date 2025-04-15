package ExemploComposite;

public class ProdutoSimples implements Produto {

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}

}
