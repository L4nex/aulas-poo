package aulas2021;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String motor;
	private String cambio;
	private String banco;
	private String peso;
	private String fabricacao;
	private String pneu;
	
	public Carro(String marca, String modelo, int ano, String cor, String motor, String cambio, String banco,
			String peso, String fabricacao, String pneu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.motor = motor;
		this.cambio = cambio;
		this.banco = banco;
		this.peso = peso;
		this.fabricacao = fabricacao;
		this.pneu = pneu;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}
	public String getPneu() {
		return pneu;
	}
	public void setPneu(String pneu) {
		this.pneu = pneu;
	}
	
	public void andar() {
		System.out.println("O carro andou.");
	}
	
	public void parar() {
		System.out.println("O carro parou.");
	}
	
	public void avancarMarcha() {
		System.out.println("O carro avançou uma marcha.");
	}
	
	public void reduzirMarcha() {
		System.out.println("O carro reduziu uma marcha.");
	}
	
	public void fazerCurva() {
		System.out.println("O carro fez uma curva.");
	}	

	
	

}
