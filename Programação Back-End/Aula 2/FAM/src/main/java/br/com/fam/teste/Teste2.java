package br.com.fam.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:hsqldb:hsql://localhost/","SA","");
			
			Statement stmt = connection.createStatement();
			
			System.out.print("Id: ");
			int id = scan.nextInt();
			
			System.out.print("Nome: ");
			String nome = scan.next();
			
			System.out.print("Salario: ");
			double salario = scan.nextDouble();
			
			System.out.print("Data de Admissao: ");
			String dataAdmissao = scan.next();	
			
			String sql = "INSERT INTO FUNCIONARIOS VALUES("+id+",'"+nome+"','"
					+ dataAdmissao +"', "+salario+")";
				
			stmt.executeUpdate(sql);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM FUNCIONARIOS");
			
			System.out.println();
			
			while( rs.next() ) {
				id = rs.getInt("id");
				nome = rs.getString(2);
				Date data_Admissao = rs.getDate(3);
				salario = rs.getDouble("salario");
				System.out.println(id+" | "+nome+" | "+data_Admissao+" | "+salario);
			}
			
			
			connection.close();
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
