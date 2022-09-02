package br.com.fam.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Teste1 {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:hsqldb:hsql://localhost/","SA","");
			
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM FUNCIONARIOS");
			
			while( rs.next() ) {
				int id = rs.getInt("id");
				String nome = rs.getString(2);
				Date dataAdmissao = rs.getDate(3);
				double salario = rs.getDouble("salario");
				System.out.println(id+" | "+nome+" | "+dataAdmissao+" | "+salario);
			}
			
//			stmt.executeUpdate("INSERT INTO FUNCIONARIOS VALUES(6,'Xandão','2019-01-01',4000)");
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}