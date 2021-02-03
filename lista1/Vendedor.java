package lista1;

public class Vendedor {
	
	// Definindo atributos ou variveis de instancia
	
	private String nome;
	private double salario;
	private double comissao;
	private double venda;
	
	// Construtor
	
	public Vendedor(String nome, double salario, double comissao) {
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
	}
	
	// Métodos
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void registrarVenda(double valorVenda) {
		if (valorVenda > 0.0) {
			this.venda += valorVenda;
		}
	}
	
	public double totalVenda() {
		return venda;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public double Comissao() {
		return this.totalVenda() * this.getComissao() / 100;
	}
	
	public double salarioTotal() {
		return this.getSalario() + this.Comissao();
	}

}
