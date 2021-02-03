package aulas2021;

public class Conta {

	private String numero;
	private String agencia;
	private String banco;
	private String senha;
	private double saldo;
	private String tipoConta;
	private String capital;
	private String credito;
	private int limite;
	private int poupança;
	
	public Conta(String numero, String agencia, String banco, String senha, double saldo, String tipoConta,
			String capital, String credito, int limite, int poupança) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.senha = senha;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.capital = capital;
		this.credito = credito;
		this.limite = limite;
		this.poupança = poupança;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getPoupança() {
		return poupança;
	}
	public void setPoupança(int poupança) {
		this.poupança = poupança;
	}
	
	public void sacar() {
		System.out.println("Saque realizado com sucesso.");
	}
	
	public void trocarSenha() {
		System.out.println("Senha alterada com sucesso.");
	}
	
	public void visualizarExtrato() {
		System.out.println("Extrato visualizado com sucesso.");
	}
	
	public void depositar() {
		System.out.println("Deposito feito com sucesso.");
	}
	
	public void transferir() {
		System.out.println("Transfêrencia realizada com sucesso.");
	}	

	
	
}
