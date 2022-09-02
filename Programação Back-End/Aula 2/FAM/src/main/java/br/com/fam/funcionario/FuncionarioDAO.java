package br.com.fam.funcionario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FuncionarioDAO {

	Connection connetion;
	String url = "jdbc:hsqldb:hsql://localhost/";
	String user = "SA";
	String password = "";
	
	public FuncionarioDAO() {
		try {
			connetion = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}
	
	public List<Funcionario> getAll() {
		List<Funcionario> lista = new ArrayList<>();
		
		try {
			Statement stmt = connetion.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString(2);
				Date dataAdmissao = rs.getDate(3);
				double salario = rs.getDouble("salario");
				
				lista.add(new Funcionario(id, nome, dataAdmissao, salario));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void Post(Funcionario funcionario) {
		
	}
	
	public void Put(Funcionario funcionario) {
		
	}
	
	public void Delete(Funcionario funcionario) {
		
	}
	
	public static void main(String[] args) {
		FuncionarioDAO DAO = new FuncionarioDAO();
		
		List<Funcionario> lista = DAO.getAll();
		
		for(Funcionario f : lista) {
			System.out.println(f);
		}
		
	}
	
}
