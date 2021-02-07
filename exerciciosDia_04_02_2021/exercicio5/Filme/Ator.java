package exerciciosDia_04_02_2021.exercicio5.Filme;

import java.sql.Date;

import exercicioClasses.Pessoa;

public class Ator extends Pessoa {

	private int numeroIdentificacao;
	private String nomeArtistico;
	private String nacionalidade;

	
	
	public Ator(String nome, Date dataNascimento, String corPele, String corCabelo, double altura, String profissao,
			double peso, boolean praticaEsporte, String genero, int numeroIdentificacao, String nomeArtistico,
			String nacionalidade) {
		super(nome, dataNascimento, corPele, corCabelo, altura, profissao, peso, praticaEsporte, genero);
		this.numeroIdentificacao = numeroIdentificacao;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}
	
	public void receberCache() {
		System.out.println("Pega o cache");
	}
	
	public String getInformacoes() {
		return "Nome: " + this.getNome() + ", Nacionalidade: " + this.getNacionalidade();
	}




	public void atuar() {
		System.out.println("Atuando");
	}




	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}




	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}




	public String getNomeArtistico() {
		return nomeArtistico;
	}




	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}




	public String getNacionalidade() {
		return nacionalidade;
	}




	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	


	
	
	
}
