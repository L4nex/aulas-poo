package heranca2021;

public class Aviao extends Aereo {

	private String cor;
	private String modelo;
	private int qtdAsas;
	
	public Aviao(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, boolean is_aviao, boolean is_helicoptero, String cor, String modelo, int qtdAsas) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas, nome, is_aviao, is_helicoptero);
		this.cor = cor;
		this.modelo = modelo;
		this.qtdAsas = qtdAsas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdAsas() {
		return qtdAsas;
	}

	public void setQtdAsas(int qtdAsas) {
		this.qtdAsas = qtdAsas;
	}
	
	
	public void andar() {
		System.out.println("O aviao andou.");
	}
	
	public void pousar() {
		System.out.println("O aviao pousou.");
	}
	
	public void avancarMarcha() {
		System.out.println("O aviao avançou uma marcha.");
	}
	
	public void reduzirMarcha() {
		System.out.println("O aviao reduziu uma marcha.");
	}
	
	public void fazerCurva() {
		System.out.println("O aviao fez uma curva.");
	}	
	
}
