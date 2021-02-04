package heranca2021.aula04;

public class Inteligente extends Normal {

	private int qtdComputador;
	private String audio;
	private int qtdProjetor;
	private int qtdComputadoresAlunos;
	
	public Inteligente(int capacidade, String nomeSala, String apelidoSala, String nomeProfessor, int qtdAssentos,
			int qtdQuadros, int qtdMesa, int qtdComputador, String audio, int qtdProjetor, int qtdComputadoresAlunos) {
		super(capacidade, nomeSala, apelidoSala, nomeProfessor, qtdAssentos, qtdQuadros, qtdMesa);
		this.qtdComputador = qtdComputador;
		this.audio = audio;
		this.qtdProjetor = qtdProjetor;
		this.qtdComputadoresAlunos = qtdComputadoresAlunos;
	}

	public int getQtdComputador() {
		return qtdComputador;
	}

	public void setQtdComputador(int qtdComputador) {
		this.qtdComputador = qtdComputador;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public int getQtdProjetor() {
		return qtdProjetor;
	}

	public void setQtdProjetor(int qtdProjetor) {
		this.qtdProjetor = qtdProjetor;
	}

	public int getQtdComputadoresAlunos() {
		return qtdComputadoresAlunos;
	}

	public void setQtdComputadoresAlunos(int qtdComputadoresAlunos) {
		this.qtdComputadoresAlunos = qtdComputadoresAlunos;
	}
	
	
	
}
