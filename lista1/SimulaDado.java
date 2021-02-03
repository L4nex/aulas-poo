package lista1;


public class SimulaDado {
	int[] dado = { 0, 0, 0, 0, 0, 0 };

	public int[] adicionaValor() {
		for (int i = 0; i < 100; i++) {
			int jogada = (int) (1 + Math.random() * 6);
			if (jogada == 1) {
				dado[0]++;
			} else if (jogada == 2) {
				dado[1]++;
			} else if (jogada == 3) {
				dado[2]++;
			} else if (jogada == 4) {
				dado[3]++;
			} else if (jogada == 5) {
				dado[4]++;
			} else if (jogada == 6) {
				dado[5]++;
			}
		}
		return dado;
	}

	public void imprimeArray() {
		for (int i = 0; i < dado.length; i++) {
			System.out.println("Face " + (i + 1) + " saiu " + dado[i]);

		}
	}
	

}
