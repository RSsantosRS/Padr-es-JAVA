package br.estacio.model;

public class Aluno {

	private String modelo;
	private String marca;
	private String ano;

	public Aluno(String modelo, String marca, String ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Aluno [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
	}

}
