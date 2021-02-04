package heranca2021.aula04;

public class Laboratorio extends Sala {
	
	private int qtdCadeiras;
	private int qtdQuadros;
	
	
	public Laboratorio(int capacidade, String nomeSala, String apelidoSala, int qtdCadeiras, int qtdQuadros) {
		super(capacidade, nomeSala, apelidoSala);
		this.qtdCadeiras = qtdCadeiras;
		this.qtdQuadros = qtdQuadros;
	}
	public int getQtdCadeiras() {
		return qtdCadeiras;
	}
	public void setQtdCadeiras(int qtdCadeiras) {
		this.qtdCadeiras = qtdCadeiras;
	}
	public int getQtdQuadros() {
		return qtdQuadros;
	}
	public void setQtdQuadros(int qtdQuadros) {
		this.qtdQuadros = qtdQuadros;
	}
	
	

}
