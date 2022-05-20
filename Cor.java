package br.com.fiap.exercicios.model;

public class Cor {

	// Atributos

	private String nome;
	private int r;
	private int g;
	private int b;

	// Construtores

	public Cor(String nome, int r, int g, int b) {
		super();
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// Getters e Setters

	public String getNome() {
		return nome;
	}

}
