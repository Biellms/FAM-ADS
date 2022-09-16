<%@page import="br.com.fam.pojo.Funcionario"%>
<%@page import="org.hsqldb.FunctionCustom"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fam.dao.FuncionarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista</title>
	<link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>

	<h2>Tabela Funcionarios</h2>

	<table>
	
	<tr>
	<th>RE</th><th>Nome</th><th>Data Admissão</th><th>Salário</th>
	</tr>
	
	<%
		FuncionarioDAO DAO = new FuncionarioDAO();
		List<Funcionario> lista = DAO.getFuncionarios();
		
		for(Funcionario f: lista) { 
			%>
			<tr>
			<td><%=f.getRe()%></td>
			<td><%=f.getNome()%></td>
			<td><%=f.getDataAdmissao()%></td>
			<td><%=f.getSalario()%></td>
			</tr> 
			<%
		}
	%>
	
	</table>
	
	<a href='http://localhost:9000/FAM/Funcionario/formPost.html'>Cadastrar Funcionario</a>
	<a href='http://localhost:9000/FAM/Funcionario/formPut.html'>Editar Funcionario</a>
	<a href='http://localhost:9000/FAM/Funcionario/formDelete.html'>Excluir Funcionario</a>
	<a href="http://localhost:9000/FAM/Funcionario/">Menu Inicial</a>

</body>
</html>