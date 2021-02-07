package exerciciosDia_04_02_2021.exercicio5.Filme;

import java.sql.Date;

import exercicioClasses.Pessoa;

public class Diretor extends Pessoa {

	public Diretor(String nome, Date dataNascimento, String corPele, String corCabelo, double altura, String profissao,
			double peso, boolean praticaEsporte, String genero) {
		super(nome, dataNascimento, corPele, corCabelo, altura, profissao, peso, praticaEsporte, genero);
	}

	public void receberCache() {
		System.out.println("Pega o cache");
	}
	
}
