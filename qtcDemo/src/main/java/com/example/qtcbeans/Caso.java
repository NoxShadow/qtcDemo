package com.example.qtcbeans;

import java.util.ArrayList;
import java.util.Date;

public class Caso {


	private int idCaso;
	private String titulo;
	private String descricao;
	private int idPolicial;
	private Date data;
	private double latitude;
	private double longitude;
	private float confiabilidade;
	
	private ArrayList<Envolvido> envolvidos;
	
	public Caso() {}

	public Caso(String titulo, String descricao){
		setTitulo(titulo);
		setDescricao(descricao);
	}

	public int getIdCaso() {
		return idCaso;
	}

	public void setIdCaso(int idCaso) {
		this.idCaso = idCaso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdPolicial() {
		return idPolicial;
	}

	public void setIdPolicial(int idPolicial) {
		this.idPolicial = idPolicial;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public float getConfiabilidade() {
		return confiabilidade;
	}

	public void setConfiabilidade(float confiabilidade) {
		this.confiabilidade = confiabilidade;
	}

	public ArrayList<Envolvido> getEnvolvidos() {
		return envolvidos;
	}

	public void setEnvolvidos(ArrayList<Envolvido> envolvidos) {
		this.envolvidos = envolvidos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
