package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Desconto desc = new Desconto();
		desc.descontoCliente(2000);
		desc.impostoCliente();
		desc.descontoFuncionário(80);
		desc.impostoFuncionario();
		desc.descontoGerente(10000);
	}
}
