package com.aluno.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class AlunoTest {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:hsqldb:hsql://localhost/","SA","");
			
			Statement stmt = connection.createStatement();
			
			System.out.print("RA: ");
			Long ra = scan.nextLong();
			
			System.out.print("Nome: ");
			String nome = scan.next();
			
			System.out.print("Email: ");
			String email = scan.next();
			
			System.out.print("Data de Nascimento: ");
			String dataNascc = scan.next();
			
			System.out.print("Renda: ");
			double renda = scan.nextDouble();
			
			String sql = "INSERT INTO ALUNOS VALUES("+ra+",'"+nome+"','" +email+ "','"
					+ dataNascc +"', "+renda+")";
				
			stmt.executeUpdate(sql);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM ALUNOS");
			
			System.out.println();
			
			while( rs.next() ) {
				ra = rs.getLong("ra");
				nome = rs.getString(2);
				email = rs.getString(3);
				Date dataNasc = rs.getDate(4);
				renda = rs.getDouble("renda");
				System.out.println(" | "+ra+" | "+nome+" | "+email+" | "+dataNasc+" | "+renda+" |");
			}
			
			
			connection.close();
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
