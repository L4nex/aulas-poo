package heranca2021;

public class Aquatico extends Transporte {

	private String nome;
	private String peso;
	
	public Aquatico(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, String peso) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas);
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
	
}
