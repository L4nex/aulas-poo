package heranca2021.aula04;

public class Fisica extends Laboratorio {

	private String nomeProfessor;

	public Fisica(int capacidade, String nomeSala, String apelidoSala, int qtdCadeiras, int qtdQuadros,
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
	
	public void expulsarAluno() {
		System.out.println("Aluno expulso da sala");
	}
	
}
