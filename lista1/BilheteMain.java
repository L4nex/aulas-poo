package lista1;

import java.util.Arrays;

public class BilheteMain {

	public static void main(String[] args) {
		Bilhete b1 = new Bilhete("Lucas", 6);
		Bilhete b2 = new Bilhete("Lucas", 9);
		Bilhete b3 = new Bilhete("Lucas", 8);
		Bilhete b4 = new Bilhete("Lucas", 12);
		Bilhete b5 = new Bilhete("Lucas", 15);
		
		int[] v6 = {60, 23, 16, 56, 35, 33};
		int[] v7 = {5, 54, 60, 44, 8, 32, 11};
		int[] v8 = {12, 42, 16, 15, 59, 18, 22, 33};
		
		Bilhete b6 = new Bilhete("Lucas", v6);
		Bilhete b7 = new Bilhete("Lucas", v7);
		Bilhete b8 = new Bilhete("Lucas", v8);

		System.out.println(Arrays.toString(b1.getNumeros()));
		System.out.println(Arrays.toString(b2.getNumeros()));
		System.out.println(Arrays.toString(b3.getNumeros()));
		System.out.println(Arrays.toString(b4.getNumeros()));
		System.out.println(Arrays.toString(b5.getNumeros()));
		System.out.println(Arrays.toString(b6.getNumeros()));
		System.out.println(Arrays.toString(b7.getNumeros()));
		System.out.println(Arrays.toString(b8.getNumeros()));
		
		
		
		int[] sorteados = Concurso.resultado();
		System.out.println("Os números sorteados são: " + Arrays.toString(sorteados));



	}

}
