package lista1;

import java.util.Arrays;
import java.util.Random;

public class Dado {

	public static int[] SimulaDado(int qtdJogadas) {
		int[] dado = { 0, 0, 0, 0, 0, 0 };
		if (qtdJogadas <= 150000 || qtdJogadas >= 1) {
			Random rand = new Random();
			for (int i = 0; i < qtdJogadas; i++) {
				int jogada = 1 + rand.nextInt(6);
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
		}
		return dado;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(SimulaDado(100)));
	}

}
