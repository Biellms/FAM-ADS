package br.com.fam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fam.pojo.Funcionario;

public class FuncionarioDAO {

	Connection connection;
	String url = "jdbc:hsqldb:hsql://localhost/";
	String user = "SA";
	String password = "";
	
	public FuncionarioDAO() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void postFuncionario(Funcionario funcionario) {
		try {
			String sql = "INSERT INTO funcionarios VALUES(?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, funcionario.getRe());
			ps.setString(2, funcionario.getNome());
			ps.setDate(3, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
			ps.setDouble(4, funcionario.getSalario());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteFuncionario(Funcionario funcionario) {
		try {
			String sql = "DELETE FROM FUNCIONARIOS WHERE RE = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, funcionario.getRe());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void putFuncionario(Funcionario funcinario) {
		
	}
	
	public List<Funcionario> getFuncionarios() {
		
		List<Funcionario> lista = new ArrayList<>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM FUNCIONARIOS");
			
			while (rs.next()) {
				int re = rs.getInt("re");
				String nome = rs.getString(2);
				Date dataAdmissao = rs.getDate(3);
				Double salario = rs.getDouble("salario");
				
				lista.add(new Funcionario(re, nome, dataAdmissao, salario));
				
//				System.out.println(re +" | "+ nome +" | "+ dataAdmissao +" | "+ salario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static void main(String[] args) {
		FuncionarioDAO DAO = new FuncionarioDAO();
		List<Funcionario> lista = DAO.getFuncionarios();
		
		for (Funcionario f : lista) {
			System.out.println(f);
		}
	}
}
