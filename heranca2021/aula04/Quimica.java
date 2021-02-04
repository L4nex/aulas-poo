package heranca2021.aula04;

public class Quimica extends Laboratorio {

	private String nomeProfessor;

	public Quimica(int capacidade, String nomeSala, String apelidoSala, int qtdCadeiras, int qtdQuadros,
			String nomeProfessor) {
		super(capacidade, nomeSala, apelidoSala, qtdCadeiras, qtdQuadros);
		this.nomeProfessor = nomeProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public void comecarAula() {
		System.out.println("A aula começou");
	}
	
	public void fazerChamada() {
		System.out.println("A chamada iniciou");
	}
}
