package java2;

import java.util.ArrayList;

public class Fabrica {

	private final String marca = "Fiat";
	private ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	Fabrica(String marca){
	}
	
	public final String getmMarca() {
		return marca;
	}
	
	public final ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	
	public void construirVeiculoCarga(String modelo, int kilosCarga) {
		Carga carg = new Carga(this.marca, modelo, kilosCarga);
		veiculos.add(carg);
	}
		
	public void construirVeiculoTransporte(String modelo, int qtPassageiros) {
		Transporte t = new Transporte(this.marca, modelo, qtPassageiros);
		veiculos.add(t);
	}
	
	public void construirVeiculoCorrida(String modelo, double velocidadeMax) {
		Corrida c = new Corrida(this.marca, modelo, velocidadeMax);
		veiculos.add(c);
	}
	
	public int qtVeiculosCarga() {
		int qtdCarga = 0;
		for (Veiculo v: veiculos)	 {
			if (v instanceof Carga) {
				qtdCarga =+ 1;
			}
		}
		return qtdCarga;
	}
	
	public int qtVeiculosTransporte() {
		int qtdTransporte = 0;
		for (Veiculo v: veiculos)	 {
			if (v instanceof Transporte) {
				qtdTransporte =+ 1;
			}
		}
		return qtdTransporte;
	}
	
	public int qtVeiculosCorrida() {
		int qtdCorrida = 0;
		for (Veiculo v: veiculos)	 {
			if (v instanceof Corrida) {
				qtdCorrida =+ 1;
			}
		}
		return qtdCorrida;
	}
}
