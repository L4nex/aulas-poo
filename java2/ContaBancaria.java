package java2;

public class ContaBancaria implements Imprimivel {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	@Override
	public String formatoImpressao() {
		String impressao = "Nome: " + titular + ". Saldo: R$" + saldo;
		return impressao;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
