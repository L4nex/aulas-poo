package aulas2021;

public class Animal {
	
	private String especie;
	private String habitat;
	private String altura;
	private String idade;
	private String peso;
	private String cor;
	private String sexo;
	private String regiao;
	private String pelagem;
	private String alimentacao;
	
	
	public Animal(String especie, String habitat, String altura, String idade, String peso, String cor, String sexo,
			String regiao, String pelagem, String alimentacao) {
		this.especie = especie;
		this.habitat = habitat;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
		this.cor = cor;
		this.sexo = sexo;
		this.regiao = regiao;
		this.pelagem = pelagem;
		this.alimentacao = alimentacao;
	}

	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getPeso() {
		return peso;
	}
	
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String getPelagem() {
		return pelagem;
	}
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public String getAlimentacao() {
		return alimentacao;
	}
	
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public void andar() {
		System.out.println("O animal andou.");
	}
	
	public void comer() {
		System.out.println("O animal comeu.");
	}
	
	public void nadar() {
		System.out.println("O animal andou.");
	}
	
	public void atacar() {
		System.out.println("O animal atacou.");
	}
	
	public void comunicar() {
		System.out.println("O animal comunicou.");
	}	
	
}
