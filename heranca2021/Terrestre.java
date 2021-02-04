package heranca2021;

public class Terrestre extends Transporte {
	
	private String nome;
	private String tracao;
	
	public Terrestre(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, String peso, String tracao) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas);
		this.nome = nome;
		this.tracao = tracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}
	
	

}
