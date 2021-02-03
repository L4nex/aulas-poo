package lista1;

public class Venda {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Lucas", 2000.0, 10.0);
		System.out.println(vendedor1.getNome() + ", " + vendedor1.getSalario() + ", " + vendedor1.getComissao() + ", " + vendedor1.totalVenda());
		vendedor1.registrarVenda(100.0);
		System.out.println(vendedor1.getNome() + ", " + vendedor1.getSalario() + ", " + vendedor1.getComissao() + ", " + vendedor1.totalVenda());
		vendedor1.registrarVenda(100.0);
		System.out.println(vendedor1.getNome() + ", " + vendedor1.getSalario() + ", " + vendedor1.getComissao() + ", " + vendedor1.totalVenda());
		vendedor1.getComissao();
		System.out.println(vendedor1.Comissao() + ", " + vendedor1.salarioTotal());
	}

}
