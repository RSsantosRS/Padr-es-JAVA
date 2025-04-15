package ExemploBridge;

public class Sms implements CanalEnvio {

	@Override
	public void enviar(String texto) {
		System.out.println("Mensagem de texto via SMS:" + texto);
		// TODO Auto-generated method stub

	}

}
