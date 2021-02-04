package heranca2021.aula04;

public class SalaAula extends Sala {
	
	private String nomeProfessor;

	public SalaAula(int capacidade, String nomeSala, String apelidoSala, String nomeProfessor) {
		super(capacidade, nomeSala, apelidoSala);
		this.nomeProfessor = nomeProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	
}
