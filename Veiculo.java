package br.com.fiap.exercicios.model;

public class Veiculo {

	protected String modelo;
	protected int qntLugares;
	protected double comprimento;
	protected int anoFabricacao;
	protected Cor cor;

	// Construtores

	public Veiculo(String modelo, int qntLugares, double comprimento, int anoFabricacao, Cor cor) {
		super();
		this.modelo = modelo;
		this.qntLugares = qntLugares;
		this.comprimento = comprimento;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}

	// Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQntLugares() {
		return qntLugares;
	}

	public void setQntLugares(int qntLugares) {
		this.qntLugares = qntLugares;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
