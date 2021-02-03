package ava;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private String usuario;
	private ArrayList<String> senhasUtilizadas = new ArrayList<>(5);

	public Usuario(String usuario, String senhaInicial) {
		this.usuario = Objects.requireNonNull(usuario);
		senhaInicial = Objects.requireNonNull(senhaInicial);
		senhasUtilizadas.add(0, senhaInicial);
		
	}

	public boolean loginOK(String senha) {
		return senhasUtilizadas.get(0).equals(senha);
	}

	public boolean trocarSenha(String senhaAtual, String senhaNova) {
		if (senhaNova != null) {
			if (!senhaAtual.equals(senhasUtilizadas.get(0))) {
				return false;
			}
			if (senhasUtilizadas.contains(senhaNova)) {
				return false;
			}else {
				if (senhasUtilizadas.size() > 4) {
					senhasUtilizadas.remove(4);
				}
				senhasUtilizadas.add(0, senhaNova);
				return true;
			}
		}
		return false;
	}

	public String getUsuario() {
		return usuario;
	}
}