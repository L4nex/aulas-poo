package lista1;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Lucas", "00100200304");
		System.out.println(pessoa.getCpf());
		pessoa.setAnoNascimento(2002);
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getMaiorIdade());

	}
}