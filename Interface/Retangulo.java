package Interface;

public class Retangulo extends FigurasGeometricas {
	
	private double area;

	public Retangulo(double altura, double base, double raio) {
		super(altura, base, raio);
	}
	
	public void area() {
		this.area = base * altura;
		System.out.println("A área é de: " + this.area);
	}

}
