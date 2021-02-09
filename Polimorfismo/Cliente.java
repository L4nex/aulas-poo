package Polimorfismo;

import java.sql.Date;

import exercicioClasses.Pessoa;

public class Cliente extends Pessoa {

	public Cliente(String nome, Date dataNascimento, String corPele, String corCabelo, double altura, String profissao,
			double peso, boolean praticaEsporte, String genero) {
		super(nome, dataNascimento, corPele, corCabelo, altura, profissao, peso, praticaEsporte, genero);
	}	
}
