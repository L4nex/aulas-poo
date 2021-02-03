package lista1;


public class Vetor {

	public static int[] inverteVetor(int[] vetor) {
		if (vetor == null) {
			return null;
		}

		int[] aux = new int[vetor.length];
		int j = 0;

		for (int i = vetor.length - 1; i >= 0; i--) {
			aux[j] = vetor[i];
			j++;
		}

		int[] vetorInverso = new int[j];

		for (int i = 0; i < j; i++) {
			vetorInverso[i] = aux[i];
		}

		return vetorInverso;
	}

	public static String concatenaVetor(char[] v) {
		String frase = new String(v);
		return frase;

	}
}
