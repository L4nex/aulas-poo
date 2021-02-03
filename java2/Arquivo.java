package java2;

public class Arquivo implements Imprimivel {
	
	private String nomeArquivo;
	private String conteudo;
	
	public Arquivo(String nomeArquivo, String conteudo) {
		this.nomeArquivo = nomeArquivo;
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	@Override
	public String formatoImpressao() {
		return conteudo;
	}

}
