package java2;

import java.util.ArrayList;

public class FilaImpressao {
	private ArrayList<Imprimivel> arquivos = new ArrayList<>();
	
	FilaImpressao(){}
	
	public void incluirNaFila(Imprimivel o) {
		arquivos.add(o);
	}
	
	public void imprimirTodos() {
		Impressora impressora = new Impressora();
		for (Imprimivel i: arquivos){
			impressora.imprimir(i);	
		}
		arquivos.clear();
	}

}
