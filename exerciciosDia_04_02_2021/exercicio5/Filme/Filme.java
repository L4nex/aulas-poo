package exerciciosDia_04_02_2021.exercicio5.Filme;

import java.time.Duration;
import java.util.ArrayList;

public class Filme {

	private String tipo;
	private String genero;
	private String tituloOriginal;
	private String tituloPortugues;
	private Duration duracao;
	private int faixaEtaria;
	private String paisOrigem;
	private ArrayList<Ator> elenco;
	private Diretor diretor;
	
	public Filme(String tipo, String genero, String tituloOriginal, String tituloPortugues, Duration duracao,
			int faixaEtaria, String paisOrigem, ArrayList<Ator> elenco, Diretor diretor) {
		super();
		this.tipo = tipo;
		this.genero = genero;
		this.tituloOriginal = tituloOriginal;
		this.tituloPortugues = tituloPortugues;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.paisOrigem = paisOrigem;
		this.elenco = elenco;
		this.diretor = diretor;
	}
	
	public void assistir() {
		System.out.println("Você está assistindo " + this.tituloPortugues);
	}

	public String getInformacoesElenco() {
		String info = "";
		for (Ator ator : elenco) {
			info += ator.getInformacoes() + "\n";
		}
		return info;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPortugues() {
		return tituloPortugues;
	}

	public void setTituloPortugues(String tituloPortugues) {
		this.tituloPortugues = tituloPortugues;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public ArrayList<Ator> getElenco() {
		return elenco;
	}

	public void setElenco(ArrayList<Ator> elenco) {
		this.elenco = elenco;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	
	
}
