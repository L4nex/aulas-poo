package Interface;

public class Circulo extends FigurasGeometricas{
	
	private double area;

	public Circulo(double altura, double base, double raio) {
		super(altura, base, raio);
	}
	
	public void area() {
		this.area = 3.14 * (raio * raio);
		System.out.println("A área é de: " + this.area);
	}
	
	

}
