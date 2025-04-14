package br.estacio;

import br.estacio.input.CarroInput;
import br.estacio.model.Aluno;
import br.estacio.util.CarroUtil;

public class main {

	public static void main(String[] args) {
		// pra rodar main(nome classe) crtl + espaço
		CarroUtil util = new CarroUtil();
		CarroInput input = new CarroInput();
		Aluno aluno = new Aluno();
		aluno.setMarca(input.lerMarca());
		aluno.setModelo(input.lerModelo());
		aluno.setAno(input.lerAno());

		Integer resposta = util.writeAluno(aluno); // gravação do arquivo
		if (resposta.equals(1)) {
			System.out.println("gravação bem sucedida");
		} else {
			System.out.println("gravação não concluida");
		}

	}
}
