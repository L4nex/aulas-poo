package lista1;

public class App {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Lucas", 1200);
		DadosConta(conta1);
		conta1.sacar(200.0);
		DadosConta(conta1);
		
		Conta conta2 = new Conta("Jubileu", 500);
		DadosConta(conta2);
		conta2.sacar(300.0);
		DadosConta(conta2);
	}

	private static void DadosConta(Conta c) {
		System.out.println(c.getTitular() + ", tem o saldo no valor de: " + c.getSaldo() + " reais.");
	}
}
