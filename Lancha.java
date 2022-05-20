package br.com.fiap.exercicios.model;

public class Lancha extends Veiculo {

	private int qntMotores;

	// Construtores

	public Lancha(int qntMotores, String modelo, int qntLugares, double comprimento, int anoFabricacao, Cor cor) {
		super(modelo, qntLugares, comprimento, anoFabricacao, cor);
		this.qntMotores = qntMotores;
	}

	public void setQntMotores(int qntMotores) {
		this.qntMotores = qntMotores;
	}

	// Getters e Setters

	public int getQntMotores() {
		return qntMotores;
	}

}
