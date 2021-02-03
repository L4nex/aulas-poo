package aulas2021;

public class Pessoa {

	private String nome;
	private int idade;
	private String altura;
	private String etnia;
	private String peso;
	private String cpf;
	private String cnpj;
	private String nacionalidade;
	private int alergia;
	private int cabelo;
	
	
	public Pessoa(String nome, int idade, String altura, String etnia, String peso, String cpf, String cnpj,
			String nacionalidade, int alergia, int cabelo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.etnia = etnia;
		this.peso = peso;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nacionalidade = nacionalidade;
		this.alergia = alergia;
		this.cabelo = cabelo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getAltura() {
		return altura;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}


	public String getEtnia() {
		return etnia;
	}


	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getAlergia() {
		return alergia;
	}


	public void setAlergia(int alergia) {
		this.alergia = alergia;
	}


	public int getCabelo() {
		return cabelo;
	}


	public void setCabelo(int cabelo) {
		this.cabelo = cabelo;
	}
	
	public void andar() {
		System.out.println("A pessoa andou.");
	}
	
	public void parar() {
		System.out.println("A pessoa parou.");
	}
	
	public void correr() {
		System.out.println("A pessoa correu.");
	}
	
	public void falar() {
		System.out.println("A pessoa falou.");
	}
	
	public void comer() {
		System.out.println("A pessoa comeu.");
	}	

	
	
}
