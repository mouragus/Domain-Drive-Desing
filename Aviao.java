package br.com.fiap.exercicios.model;

public class Aviao extends Veiculo {

	// Atributos

	private String prefixo;
	private int qntTurbinas;

	// Construtores

	public Aviao(String prefixo, int qntTurbinas, String modelo, int qntLugares, double comprimento, int anoFabricacao,
			Cor cor) {
		super(modelo, qntLugares, comprimento, anoFabricacao, cor);
		this.prefixo = prefixo;
		this.qntTurbinas = qntTurbinas;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getQntTurbinas() {
		return qntTurbinas;
	}

	public void setQntTurbinas(int qntTurbinas) {
		this.qntTurbinas = qntTurbinas;
	}

	// Getters e Setters

	public String getPrefixo() {
		return prefixo;
	}

}
