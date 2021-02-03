package ava;

import java.util.ArrayList;
import java.util.Objects;

public class Loja {
	
	private String nomeLoja;
	private ArrayList<Nacional> produtosNacionais = new ArrayList<>();
	private ArrayList<Importado> produtosImportados = new ArrayList<>();
	
	public Loja(String nomeLoja) {
		this.nomeLoja = Objects.requireNonNull(nomeLoja);
	}
	
	
	public boolean novoProduto(Nacional produtoNacional) {
		if(produtosNacionais.contains(produtoNacional)) {
			return false;
		}
		produtosNacionais.add(produtoNacional);
		return true;
	}
	
	public boolean novoProduto(Importado produtoImportado) {
		if(produtosImportados.contains(produtoImportado)) {
			return false;
		}
		produtosImportados.add(produtoImportado);
		return true;
	}
	
	public Nacional nacionalMaisCaro() {
		Nacional produtoMaiorPreco = null;
		for (Nacional n: produtosNacionais) {
			if(produtoMaiorPreco == null || n.getPrecoFinal() > produtoMaiorPreco.getPrecoFinal()) {
				produtoMaiorPreco = n;
			}
		}
		return produtoMaiorPreco;
	}
	
	public Importado importadoMaisBarato() {
		Importado produtoMenorPreco = null;
		for (Importado n: produtosImportados) {
			if(produtoMenorPreco == null || n.getPrecoMinimo() < produtoMenorPreco.getPrecoMinimo()) {
				produtoMenorPreco = n;
			}
		}
		return produtoMenorPreco;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}
	
}
