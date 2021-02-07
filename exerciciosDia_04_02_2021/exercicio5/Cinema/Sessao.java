package exerciciosDia_04_02_2021.exercicio5.Cinema;

import java.sql.Date;

import exerciciosDia_04_02_2021.exercicio5.Filme.Filme;

public class Sessao {

	private Filme filme;
	private Date horarioInicio;
	private Date horarioFim;
	private int quantidadePublicoAtual;
	
	public Sessao(Filme filme, Date horarioInicio, int quantidadePublicoAtual) {
		super();
		this.filme = filme;
		this.horarioInicio = horarioInicio;
		this.quantidadePublicoAtual = quantidadePublicoAtual;
		this.horarioFim = new Date( this.horarioInicio.getTime() + this.filme.getDuracao().getSeconds() * 1000);
	}
	
	public void finalizarSessao() {
		System.out.println("Acabou o filme, saiam todos");
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Date getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
		this.horarioFim = new Date( this.horarioInicio.getTime() + this.filme.getDuracao().getSeconds() * 1000);
	}

	public Date getHorarioFim() {
		return horarioFim;
	}

	public int getQuantidadePublicoAtual() {
		return quantidadePublicoAtual;
	}

	public void setQuantidadePublicoAtual(int quantidadePublicoAtual) {
		this.quantidadePublicoAtual = quantidadePublicoAtual;
	}
	
	
	
	
	
	
	
}
