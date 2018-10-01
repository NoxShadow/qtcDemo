package com.example.qtcbeans;

public class Envolvido {
	private int idEnvolvido;
	private String descricao;
	
	public Envolvido() {}
	
	public Envolvido(int idEnvolvido) {
		setIdEnvolvido(idEnvolvido);
	}
	
	public Envolvido(String descricao) {
		setDescricao(descricao);
	}
	
	public Envolvido(int idEnvolvido, String descricao) {
		setIdEnvolvido(idEnvolvido);
		setDescricao(descricao);
	}

	public int getIdEnvolvido() {
		return idEnvolvido;
	}

	public void setIdEnvolvido(int idEnvolvido) {
		this.idEnvolvido = idEnvolvido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
