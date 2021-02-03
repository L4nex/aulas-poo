package lista1;

import java.util.Random;

public class Bilhete {

	private int[] numeros;
	private String nome;
	
	public Bilhete(String nome, int qtd) {
		this.nome = nome;
		this.numeros = new int[qtd];
		Random rand = new Random();
		int num;
		for (int i = 0; i < qtd; i++) {
			do {
			num = 1 + rand.nextInt(60);	
			} while (jaTem(num));
			this.numeros[i] = num;
		}
	}
	
	private boolean jaTem(int n) {
		for (int x : this.numeros) {
			if (x == n) {
				return true;
			}
		}
		return false;
	}
	
	
	public Bilhete(String nome, int[] numeros) {
		this.nome = nome;
		this.numeros = numeros;
	}
	
	public int[] getNumeros() {
		return numeros;
	}
	
	public String getNome() {
		return nome;
	}

}
