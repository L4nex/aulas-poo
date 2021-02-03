package java2;

public class Corrida extends Veiculo {

	public double velocidadeMax;
	
	public Corrida(String marca, String modelo,double velocidadeMax) {
		super(marca, modelo);
		this.velocidadeMax = velocidadeMax;
	}
	
	public final double getVelocidade() {
		return velocidadeMax;
	}

}
