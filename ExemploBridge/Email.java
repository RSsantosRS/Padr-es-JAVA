package ExemploBridge;

public class Email implements CanalEnvio {

	@Override
	public void enviar(String texto) {
		System.out.println("Mensagem de texto via Email:" + texto);
		// TODO Auto-generated method stub

	}

}
