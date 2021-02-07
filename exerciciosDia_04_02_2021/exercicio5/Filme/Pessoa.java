package exerciciosDia_04_02_2021.exercicio5.Filme;

import java.sql.Date;

public class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	private String corPele;
	private String corCabelo;
	private double altura;
	private String profissao;
	private double peso;
	private boolean praticaEsporte;
	private String genero;
	public Pessoa(String nome, Date dataNascimento, String corPele, String corCabelo, double altura, String profissao,
			double peso, boolean praticaEsporte, String genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.corPele = corPele;
		this.corCabelo = corCabelo;
		this.altura = altura;
		this.profissao = profissao;
		this.peso = peso;
		this.praticaEsporte = praticaEsporte;
		this.genero = genero;
	}
	
	public void andar() {
		System.out.println("Pessoa andou");
	}
	
	public void falar() {
		System.out.println("Pessoa falou");
	}
	
	public void comer() {
		System.out.println("Pessoa comeu");
	}
	
	public void reproduzir() {
		System.out.println("Pessoa reproduziu");
	}
	
	public void aprender() {
		System.out.println("Pessoa aprender");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCorPele() {
		return corPele;
	}
	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isPraticaEsporte() {
		return praticaEsporte;
	}
	public void setPraticaEsporte(boolean praticaEsporte) {
		this.praticaEsporte = praticaEsporte;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}