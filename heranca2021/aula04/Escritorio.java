package heranca2021.aula04;

public class Escritorio extends Sala {
	
	private int qtdFuncionarios;

	public Escritorio(int capacidade, String nomeSala, String apelidoSala, int qtdFuncionarios) {
		super(capacidade, nomeSala, apelidoSala);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public void reservarEscritorio() {
		System.out.println("Reserva concluida com sucesso.");
	}
	
	
}
