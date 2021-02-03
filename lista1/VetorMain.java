package lista1;

import java.util.Arrays;

public class VetorMain {

	public static void main(String[] args) {
		char[] v = {'a', 'l', 'f', 'a', 'b', 'e', 't', 'o'};
		System.out.println(Vetor.concatenaVetor(v));
		
		int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(Vetor.inverteVetor(v1)));
		System.out.println(Arrays.toString(v1));

	}

}
