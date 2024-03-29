package com.aluno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aluno.model.Aluno;

public class AlunoDAO {

	Connection connection;
	String url = "jdbc:hsqldb:hsql://localhost/";
	String user = "SA";
	String password = "";
	
	public AlunoDAO() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public Aluno getByRa(Long ra) {
		try {
			String sql = "SELECT * FROM ALUNOS WHERE RA = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setLong(1, ra);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new Aluno(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDouble(5));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public List<Aluno> getLista() {
		List<Aluno> lista = new ArrayList<>();
		
		try {
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery(" SELECT * FROM ALUNOS ORDER BY RA");
			
			while (rs.next()) {
				Long ra = rs.getLong("ra");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				Date dataNasc = rs.getDate("dataNasc");
				Double renda = rs.getDouble("renda");
				
				lista.add(new Aluno(ra, nome, email, dataNasc, renda));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return lista;
	}
	
	public void postAluno(Aluno aluno) {
		try {
			String sql = "INSERT INTO ALUNOS VALUES(?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setLong(1, aluno.getRa());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setDate(4, new java.sql.Date(aluno.getDataNasc().getTime()));
			ps.setDouble(5, aluno.getRenda());
			
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void putAluno(Aluno aluno) {
		try {
			String sql = "UPDATE ALUNOS SET NOME=?, EMAIL=?, DATANASC=?, RENDA=? WHERE RA=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setDate(3, new java.sql.Date(aluno.getDataNasc().getTime()));
			ps.setDouble(4, aluno.getRenda());
			ps.setLong(5, aluno.getRa());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void deleteAluno(Aluno aluno) {
		try {
			String sql = "DELETE FROM ALUNOS WHERE RA = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, aluno.getRa());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
