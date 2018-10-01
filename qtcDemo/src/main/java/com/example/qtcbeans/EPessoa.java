package com.example.qtcbeans;

public class EPessoa extends Envolvido {

	private int idEPessoa;
	private String nome;
	private String apelido;
	private String sexo;
	private String idade;
	
	public EPessoa() {}

	public int getIdEPessoa() {
		return idEPessoa;
	}

	public void setIdEPessoa(int idEPessoa) {
		this.idEPessoa = idEPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
}
