package lista1;

public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCpf() {

		String bloco1 = cpf.substring(0, 3);
		String bloco2 = cpf.substring(3, 6);
		String bloco3 = cpf.substring(6, 9);
		String bloco4 = cpf.substring(9, 11);

		return bloco1 + "." + bloco2 + "." + bloco3 + "-" + bloco4;
	}

	public void setAnoNascimento(int ano) {
		this.idade = 2020 - ano;
	}

	public int getIdade() {
		return this.idade;
	}

	public boolean getMaiorIdade() {
		if (this.idade >= 18)
			return true;
		else
			return false;
	}

}
