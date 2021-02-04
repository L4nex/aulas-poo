package heranca2021;

public class Aereo extends Transporte {

	private String nome;
	private boolean is_aviao;
	private boolean is_helicoptero;
	
	public Aereo(int capacidade, String tipo, String tipoCombustivel, String velocidadeMax, String qtdRodas,
			String nome, boolean is_aviao, boolean is_helicoptero) {
		super(capacidade, tipo, tipoCombustivel, velocidadeMax, qtdRodas);
		this.nome = nome;
		this.is_aviao = is_aviao;
		this.is_helicoptero = is_helicoptero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isIs_aviao() {
		return is_aviao;
	}

	public void setIs_aviao(boolean is_aviao) {
		this.is_aviao = is_aviao;
	}

	public boolean isIs_helicoptero() {
		return is_helicoptero;
	}

	public void setIs_helicoptero(boolean is_helicoptero) {
		this.is_helicoptero = is_helicoptero;
	}
	
	
	
}
