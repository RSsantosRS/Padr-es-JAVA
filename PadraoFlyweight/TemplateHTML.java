package PadraoFlyweight;

public class TemplateHTML implements EmailTemplate {
	private String layout;

	public TemplateHTML(String layout) {
		this.layout = layout;
	}

	@Override
	public void render(String conteudo) {
		// TODO Auto-generated method stub

	}

}
