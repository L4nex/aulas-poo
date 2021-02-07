package exerciciosDia_04_02_2021.exercicio5.Cinema;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio5.Filme.Filme;

public class Cinema {

	private int identificacaoUnica;
	private String nomeFantasia;
	private Endereco endereco;
	private int capacidadeLotacao;
	private int quantidadeTotalSalas;
	private int quantidadeDisponivelSalas;
	private String telefone;
	private ArrayList<Filme> filmesCartaz;
	private ArrayList<Sessao> sessoes;
	
	public Cinema(int identificacaoUnica, String nomeFantasia, Endereco endereco, int capacidadeLotacao,
			int quantidadeTotalSalas, int quantidadeDisponivelSalas, String telefone, ArrayList<Filme> filmesCartaz,
			ArrayList<Sessao> sessoes) {
		super();
		this.identificacaoUnica = identificacaoUnica;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.capacidadeLotacao = capacidadeLotacao;
		this.quantidadeTotalSalas = quantidadeTotalSalas;
		this.quantidadeDisponivelSalas = quantidadeDisponivelSalas;
		this.telefone = telefone;
		this.filmesCartaz = filmesCartaz;
		this.sessoes = sessoes;
	}
	
	public void pagarFuncionarios() {
		System.out.println("pagando a cangada");
	}
	
	public void fazerPropaganda() {
		System.out.println("Venham no cinema " + this.nomeFantasia);
	}
	
	public int getIdentificacaoUnica() {
		return identificacaoUnica;
	}
	public void setIdentificacaoUnica(int identificacaoUnica) {
		this.identificacaoUnica = identificacaoUnica;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getCapacidadeLotacao() {
		return capacidadeLotacao;
	}
	public void setCapacidadeLotacao(int capacidadeLotacao) {
		this.capacidadeLotacao = capacidadeLotacao;
	}
	public int getQuantidadeTotalSalas() {
		return quantidadeTotalSalas;
	}
	public void setQuantidadeTotalSalas(int quantidadeTotalSalas) {
		this.quantidadeTotalSalas = quantidadeTotalSalas;
	}
	public int getQuantidadeDisponivelSalas() {
		return quantidadeDisponivelSalas;
	}
	public void setQuantidadeDisponivelSalas(int quantidadeDisponivelSalas) {
		this.quantidadeDisponivelSalas = quantidadeDisponivelSalas;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Filme> getFilmesCartaz() {
		return filmesCartaz;
	}
	public void setFilmesCartaz(ArrayList<Filme> filmesCartaz) {
		this.filmesCartaz = filmesCartaz;
	}
	public ArrayList<Sessao> getSessoes() {
		return sessoes;
	}
	public void setSessoes(ArrayList<Sessao> sessoes) {
		this.sessoes = sessoes;
	}
	
	
	
}
