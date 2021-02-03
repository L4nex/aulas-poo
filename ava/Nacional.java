package ava;

import java.util.Objects;

public class Nacional extends Produto {
	
	private Categoria categoria;
	
	Nacional(int codigo, String descricao, double precoCusto, Categoria categoria){
		super(codigo, descricao, precoCusto);
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public double getPrecoFinal() {
		return getPrecoCusto() + (getPrecoCusto() * this.categoria.getPercentual() / 100);
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
		Nacional other = (Nacional) obj;
		
		return super.equals(other) && categoria.equals( other.categoria);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), categoria);
	}
	
	

}
