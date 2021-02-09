package Interface;

public class Triangulo extends FigurasGeometricas {

	private double area;
	
	public Triangulo(double altura, double base, double raio) {
		super(altura, base, raio);
	}
	
	public void area() {
		this.area = base * altura / 2;
		System.out.println("A área é de: " + this.area);
	}

}
