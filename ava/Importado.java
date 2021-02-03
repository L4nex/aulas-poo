package ava;

import java.util.Objects;

public class Importado extends Produto{
	private double taxaImportacao;
	
	Importado(int codigo, String descricao, double precoCusto, double taxaImportacao){
		super(codigo, descricao, precoCusto);
		this.taxaImportacao = taxaImportacao;
	}
	
	public double getPrecoMinimo() {
		return getPrecoCusto() + (getPrecoCusto() * this.taxaImportacao / 100);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Importado other = (Importado) obj;
		
		return super.equals(other) && Objects.equals(taxaImportacao, other.taxaImportacao);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), taxaImportacao);
	}
}
