package heranca2021.aula04;

public class Sala {
	
	private int capacidade;
	private String nomeSala;
	private String apelidoSala;
	
	public Sala(int capacidade, String nomeSala, String apelidoSala) {
		super();
		this.capacidade = capacidade;
		this.nomeSala = nomeSala;
		this.apelidoSala = apelidoSala;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getApelidoSala() {
		return apelidoSala;
	}
	public void setApelidoSala(String apelidoSala) {
		this.apelidoSala = apelidoSala;
	}
	
	

}
