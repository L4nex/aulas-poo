package Interface;

public class Quadrado extends FigurasGeometricas {
	
	public double area;

	public Quadrado(double altura, double base, double raio) {
		super(altura, base, raio);
	}
	
	public void area() {
		this.area = base * altura;
		System.out.println("A área é de: " + this.area);
	}

	

}
