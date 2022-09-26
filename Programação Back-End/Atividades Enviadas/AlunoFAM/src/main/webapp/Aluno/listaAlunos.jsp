<%@page import="com.aluno.model.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="com.aluno.dao.AlunoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tabela Alunos</title>
	<link rel="stylesheet" type="text/css" href="./global.css">
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
	<main>
		<h2>Tabela Alunos</h2>
	
		<table>
		
		<tr>
		<th>RA</th><th>Nome</th><th>Email</th><th>Data de Nascimento</th><th>Renda</th>
		</tr>
		
		<%
			AlunoDAO dao = new AlunoDAO();
			List<Aluno> lista = dao.getAllAlunos();
			
			for(Aluno a: lista) { 
				%>
				<tr>
				<td><%=a.getRa()%></td>
				<td><%=a.getNome()%></td>
				<td><%=a.getEmail()%></td>
				<td><%=a.getDataNasc()%></td>
				<td><%=a.getRenda()%></td>
				</tr> 
				<%
			}
		%>
		</table>
		
		<a href="/AlunoFAM/Aluno/">Voltar</a>
	</main>	
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>