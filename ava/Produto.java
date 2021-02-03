package ava;

import java.util.Objects;

public class Produto {
	private int codigo;
	private String descricao;
	private double precoCusto; 
	
	Produto(int codigo, String descricao, double precoCusto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoCusto() {
		return precoCusto;
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
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo)
				&& descricao.equals(other.descricao) && precoCusto == other.precoCusto;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, precoCusto);
	}
	
	
}
