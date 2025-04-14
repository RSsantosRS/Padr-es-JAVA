package br.estacio.util;

import java.io.FileWriter;

import br.estacio.model.Aluno;

public class CarroUtil {
	public Integer writeAluno(Aluno carro) {
		try {
			FileWriter file = new FileWriter("C:/Users/Alunoti/Desktop/carro.txt", true);
			file.write(carro + "\n");
			file.flush();
			file.close();
			return 1;

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return -1;
		}
	}
}
