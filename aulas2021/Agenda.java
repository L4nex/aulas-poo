package aulas2021;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Integer> contatos = new ArrayList<>();

	public Agenda(ArrayList<Integer> contatos) {
		this.contatos = contatos;
	}


	public void adicionar(String nomePessoa, int idContato) {
		contatos.add(idContato);
		System.out.println("A pessoa: " + nomePessoa + " foi adicionado com sucesso no contato de nº" + idContato);
	}
	
	public void listar() {
		System.out.println("Lista: " + contatos);
	}

	public void excluir(int contato) {
		contatos.remove(contato);
	}

}
