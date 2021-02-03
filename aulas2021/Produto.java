package aulas2021;

public class Produto {

	private String nome;
	private double pre�o;
	private String peso;
	private String cor;
	private String validade;
	private String altura;
	private String largura;
	private String marca;
	private int fabricacao;
	private int usabilidade;
	
	
	public Produto(String nome, double pre�o, String peso, String cor, String validade, String altura, String largura,
			String marca, int fabricacao, int usabilidade) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
		this.peso = peso;
		this.cor = cor;
		this.validade = validade;
		this.altura = altura;
		this.largura = largura;
		this.marca = marca;
		this.fabricacao = fabricacao;
		this.usabilidade = usabilidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPre�o() {
		return pre�o;
	}


	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public String getAltura() {
		return altura;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}


	public String getLargura() {
		return largura;
	}


	public void setLargura(String largura) {
		this.largura = largura;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getFabricacao() {
		return fabricacao;
	}


	public void setFabricacao(int fabricacao) {
		this.fabricacao = fabricacao;
	}


	public int getUsabilidade() {
		return usabilidade;
	}


	public void setUsabilidade(int usabilidade) {
		this.usabilidade = usabilidade;
	}

	public void vender() {
		System.out.println("O produto foi vendido!");
	}
	
	public void remover() {
		System.out.println("O produto foi removido!");
	}
	
	public void trocarEmbalagem() {
		System.out.println("Embalagem trocada com sucesso!");
	}
	
	public void acionarGarantia() {
		System.out.println("Garantia acionada com sucesso!");
	}
	
	public void desconto() {
		System.out.println("Desconto aplicado com sucesso!");
	}	
	
}
