package br.estacio.input;

import java.util.Scanner;

public class CarroInput {
	public String lerModelo() {
		System.out.println("Digite o modelo do veículo: ");
		Scanner leitura = new Scanner(System.in);
		return leitura.nextLine();
	}

	public String lerMarca() {
		System.out.println("Digite a marca: ");
		Scanner leitura = new Scanner(System.in);
		return leitura.nextLine();
	}

	public String lerAno() {
		System.out.println("Digte a ano do veículo: ");
		Scanner leitura = new Scanner(System.in);
		return leitura.nextLine();
	}
}
