package ava;

public enum Categoria {
	
	ARTESANAL(50),INDUSTRIALIZADO(30);
	
	private double percentual;
	
	
	public double getPercentual() {
		return percentual;
	}

	Categoria(double percentual) {
		this.percentual = percentual;
	}
}
