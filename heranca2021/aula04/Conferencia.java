package heranca2021.aula04;

public class Conferencia extends Inteligente {

	private int qtdCameras;
	private int qtdMicrofones;
	private int qtdNotebooks;
	
	public Conferencia(int capacidade, String nomeSala, String apelidoSala, String nomeProfessor, int qtdAssentos,
			int qtdQuadros, int qtdMesa, int qtdComputador, String audio, int qtdProjetor, int qtdComputadoresAlunos,
			int qtdCameras, int qtdMicrofones, int qtdNotebooks) {
		super(capacidade, nomeSala, apelidoSala, nomeProfessor, qtdAssentos, qtdQuadros, qtdMesa, qtdComputador, audio,
				qtdProjetor, qtdComputadoresAlunos);
		this.qtdCameras = qtdCameras;
		this.qtdMicrofones = qtdMicrofones;
		this.qtdNotebooks = qtdNotebooks;
	}
	
	public int getQtdCameras() {
		return qtdCameras;
	}
	public void setQtdCameras(int qtdCameras) {
		this.qtdCameras = qtdCameras;
	}
	public int getQtdMicrofones() {
		return qtdMicrofones;
	}
	public void setQtdMicrofones(int qtdMicrofones) {
		this.qtdMicrofones = qtdMicrofones;
	}
	public int getQtdNotebooks() {
		return qtdNotebooks;
	}
	public void setQtdNotebooks(int qtdNotebooks) {
		this.qtdNotebooks = qtdNotebooks;
	}
	

	public void iniciarConferencia() {
		System.out.println("Conferencia iniciada.");
	}
	
}
