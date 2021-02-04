package heranca2021.aula04;

public class VideoConferencia extends Inteligente {

	private int qtdCameras;
	private int qtdMicrofones;
	private int qtdNotebooks;
	private int qtdRepetidorWifi;
	


	public VideoConferencia(int capacidade, String nomeSala, String apelidoSala, String nomeProfessor, int qtdAssentos,
			int qtdQuadros, int qtdMesa, int qtdComputador, String audio, int qtdProjetor, int qtdComputadoresAlunos,
			int qtdCameras, int qtdMicrofones, int qtdNotebooks, int qtdRepetidorWifi) {
		super(capacidade, nomeSala, apelidoSala, nomeProfessor, qtdAssentos, qtdQuadros, qtdMesa, qtdComputador, audio,
				qtdProjetor, qtdComputadoresAlunos);
		this.qtdCameras = qtdCameras;
		this.qtdMicrofones = qtdMicrofones;
		this.qtdNotebooks = qtdNotebooks;
		this.qtdRepetidorWifi = qtdRepetidorWifi;
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



	public int getQtdRepetidorWifi() {
		return qtdRepetidorWifi;
	}



	public void setQtdRepetidorWifi(int qtdRepetidorWifi) {
		this.qtdRepetidorWifi = qtdRepetidorWifi;
	}



	public void iniciarVideocConferencia() {
		System.out.println("VideoConferencia iniciada.");
	}
	
}
