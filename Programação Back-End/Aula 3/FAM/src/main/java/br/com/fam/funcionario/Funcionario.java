package br.com.fam.funcionario;

import java.util.Date;

public class Funcionario {

	private int id;
	private String nome;
	private Date dataAdmissao;
	private double salario;

	public Funcionario(int id, String nome, Date dataAdimissao, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataAdmissao = dataAdimissao;
		this.salario = salario;
	}
	
	public Funcionario() {
		super();
	}
	
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", dataAdimissao=" + dataAdmissao + ", salario=" + salario
				+ "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAdimissao() {
		return dataAdmissao;
	}
	public void setDataAdimissao(Date dataAdimissao) {
		this.dataAdmissao = dataAdimissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
