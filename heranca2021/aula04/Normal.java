package heranca2021.aula04;

public class Normal extends SalaAula {

	private int qtdAssentos;
	private int qtdQuadros;
	private int qtdMesa;
	
	public Normal(int capacidade, String nomeSala, String apelidoSala, String nomeProfessor, int qtdAssentos,
			int qtdQuadros, int qtdMesa) {
		super(capacidade, nomeSala, apelidoSala, nomeProfessor);
		this.qtdAssentos = qtdAssentos;
		this.qtdQuadros = qtdQuadros;
		this.qtdMesa = qtdMesa;
	}

	public int getQtdAssentos() {
		return qtdAssentos;
	}

	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}

	public int getQtdQuadros() {
		return qtdQuadros;
	}

	public void setQtdQuadros(int qtdQuadros) {
		this.qtdQuadros = qtdQuadros;
	}

	public int getQtdMesa() {
		return qtdMesa;
	}

	public void setQtdMesa(int qtdMesa) {
		this.qtdMesa = qtdMesa;
	}
	
	
	public void conectarTv() {
		System.out.println("A televisão foi conectada ao cabo da universidade com sucesso.");
	}
	
	
	
}
