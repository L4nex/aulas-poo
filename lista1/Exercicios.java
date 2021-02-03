package lista1;

public class Exercicios {

	public static void main(String[] args) {

		int index = 5;
		int end = 99;
		int plus = 0;

		for (int i = index; i <= end; i++) {
			if (i % 2 != 0) {
				plus += i;
			}
		}
		System.out.printf("A soma dos ímpares entre %d e %d é %d.%n", index, end, plus);
		
		int cont = index;
		plus = 0;
		while (cont <= end) {
			if (cont % 2 != 0) {
				plus += cont;
			}
			cont++;
		}
		System.out.printf("A soma dos ímpares entre %d e %d é %d.%n", index, end, plus);
		
		cont = index;
		plus = 0;
		do {
			if (cont % 2 != 0) {
				plus += cont;
			}
			cont++;
		} while (cont <= end);
		System.out.printf("A soma dos ímpares entre %d e %d é %d.%n", index, end, plus);
	}
}
