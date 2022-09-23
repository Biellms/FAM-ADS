package com.aluno.model;

import java.util.Date;

public class Aluno {

	private Long ra;
	private String nome;
	private String email;
	private Date dataNasc;
	private double renda;
	
	public Aluno(Long ra, String nome, String email, Date dataNasc, double renda) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.renda = renda;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", email=" + email +", dataNasc="+ dataNasc +", renda=" + renda + "]";
	}

	public Long getRa() {
		return ra;
	}
	public void setRa(Long ra) {
		this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
}
