package Polimorfismo;

public class Desconto {
	
	private double valorCompraCliente;
	private double valorCompraFuncionario;
	private double valorCompraGerente;
	private double descontoCliente;
	private double descontoFuncionario;
	private double descontoGerente;
	
	public void descontoCliente(double valorCompra) {
		this.valorCompraCliente = valorCompra;
		descontoCliente = valorCompra * 0.05;
		valorCompra = valorCompra - descontoCliente;
	}
	
	public void descontoFuncionário(double valorCompra) {
		this.valorCompraFuncionario = valorCompra;
		descontoFuncionario = valorCompra * 0.25;
		valorCompra = valorCompra - descontoFuncionario;
	}
	
	public void descontoGerente(double valorCompra) {
		this.valorCompraGerente = valorCompra;
		descontoGerente = valorCompra * 0.28;
		valorCompra = valorCompra - descontoGerente;
		System.out.println("O valor total da compra é: " + valorCompraGerente + " E o desconto é de: " + descontoGerente);
	}
	
	public void impostoFuncionario() {
		double imposto = valorCompraFuncionario;
		imposto = imposto *= 0.11;
		System.out.println("O valor total da compra é: " + valorCompraFuncionario + " O imposto do cliente é: " + imposto + " reais. E o desconto é de: " + descontoFuncionario);
	}
	
	public void impostoCliente() {
		double imposto = valorCompraCliente;
		imposto = imposto *= 0.03;
		System.out.println("O valor total da compra é: " + valorCompraCliente + " O imposto do cliente é: " + imposto + " reais. E o desconto é de: " + descontoCliente);
	}
}
