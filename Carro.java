package br.com.fiap.exercicios.model;

public class Carro extends Veiculo {

	// Atributos

	private int qntPortas;
	private String placa;
	private float motor;

	// Construtores

	public Carro(int qntPortas, String placa, float motor, String modelo, int qntLugares, double comprimento,
			int anoFabricacao, Cor cor) {
		super(modelo, qntLugares, comprimento, anoFabricacao, cor);
		this.qntPortas = qntPortas;
		this.placa = placa;
		this.motor = motor;
	}

	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	// Getters e Setters

	public int getQntPortas() {
		return qntPortas;
	}

}
