package heranca2021;

public class Automovel extends Terrestre {

	private String cor;
	private String qtd_portas;
	private String placa;
	private String modelo;
	

	public Automovel(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, String peso, String tracao, String cor, String qtd_portas, String placa, String modelo) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas, nome, peso, tracao);
		this.cor = cor;
		this.qtd_portas = qtd_portas;
		this.placa = placa;
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getQtd_portas() {
		return qtd_portas;
	}


	public void setQtd_portas(String qtd_portas) {
		this.qtd_portas = qtd_portas;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void andar() {
		System.out.println("O automovel andou.");
	}
	
	public void parar() {
		System.out.println("O automovel parou.");
	}
	
	public void avancarMarcha() {
		System.out.println("O automovel avançou uma marcha.");
	}
	
	public void reduzirMarcha() {
		System.out.println("O automovel reduziu uma marcha.");
	}
	
	public void fazerCurva() {
		System.out.println("O automovel fez uma curva.");
	}	
	
}
