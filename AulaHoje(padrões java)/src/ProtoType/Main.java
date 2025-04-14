package ProtoType;

public class Main {
	public static void main(String[] args) {
		AmbienteConfig devClone = AmbientePrototypeRegistry.getPrototipo("DEV");
		devClone.exibirInfo();
		devClone.setUrl("http://dev.featureX.local");
		devClone.setUsuario("devFeatureUser");
		devClone.setTimeoutSegundos(45);
		devClone.exibirInfo();
		AmbienteConfig prodClone = AmbientePrototypeRegistry.getPrototipo("PROD");
		prodClone.exibirInfo();
		prodClone.setUrl("https://prod-novo.suaempresa.com");
		prodClone.setSenha("SenhaNova123");
		prodClone.exibirInfo();
	}

}
