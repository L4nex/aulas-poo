package java2;

public class Sequencia implements Imprimivel {
	
	private int inicio;
	private int fim;
	
	public Sequencia(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	
	@Override
	public String formatoImpressao() {
		StringBuffer sequencia = new StringBuffer();
		for (int i = inicio; i <= fim; i++) {
			sequencia.append(i);
			sequencia.append(",");
		}
		sequencia.deleteCharAt(sequencia.length() -1);
		return sequencia.toString();
	}


}
