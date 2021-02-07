package exerciciosDia_04_02_2021.exercicio5;

import java.util.ArrayList;

import exerciciosDia_04_02_2021.exercicio5.Cinema.Cinema;

public class GNC {

	private String cnpj;
	private int numeroFuncionarios;
	private ArrayList<Cinema> cinemas;
	
	
	public GNC(String cnpj, int numeroFuncionarios, ArrayList<Cinema> cinemas) {
		super();
		this.cnpj = cnpj;
		this.numeroFuncionarios = numeroFuncionarios;
		this.cinemas = cinemas;
	}
	
	public void abrirNovoCinema() {
		System.out.println("abrindo novo cinema");
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public ArrayList<Cinema> getCinemas() {
		return cinemas;
	}
	public void setCinemas(ArrayList<Cinema> cinemas) {
		this.cinemas = cinemas;
	}
	
	
	
	
	
	
}
