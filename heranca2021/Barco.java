package heranca2021;

public class Barco extends Aquatico {
	
	private String cor;
	private String qtdMotores;
	private String modelo;
	
	public Barco(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, String peso, String cor, String qtdMotores, String modelo) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas, nome, peso);
		this.cor = cor;
		this.qtdMotores = qtdMotores;
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getQtdMotores() {
		return qtdMotores;
	}
	public void setQtdMotores(String qtdMotores) {
		this.qtdMotores = qtdMotores;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void andar() {
		System.out.println("O barco andou.");
	}
	
	public void parar() {
		System.out.println("O barco parou.");
	}
	
	public void avancarMarcha() {
		System.out.println("O carro barco uma marcha.");
	}
	
	public void reduzirMarcha() {
		System.out.println("O carro barco uma marcha.");
	}
	
	public void fazerCurva() {
		System.out.println("O barco fez uma curva.");
	}	
	
}
