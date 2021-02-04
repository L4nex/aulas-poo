package heranca2021;

public class Transporte {
	
	private int capacidade;
	private String tipo;
	private String tipoCombustivel;
	private String velocidadeMax;
	private String qtdRodas;
	
	
	public Transporte(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas) {
		this.capacidade = capacidade;
		this.tipo = tipo;
		this.tipoCombustivel = tipoCombustivel;
		this.velocidadeMax = velocidadeMax;
		this.qtdRodas = qtdRodas;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTipoCombustivel() {
		return tipoCombustivel;
	}


	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public String getVelocidadeMax() {
		return velocidadeMax;
	}


	public void setVelocidadeMax(String velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}


	public String getQtdRodas() {
		return qtdRodas;
	}


	public void setQtdRodas(String qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
    public void iniciarTransporte() {
        System.out.println("Iniciando transporte");
    }

	
}
