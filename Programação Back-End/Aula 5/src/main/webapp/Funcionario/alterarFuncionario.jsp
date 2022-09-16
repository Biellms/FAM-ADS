<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.fam.pojo.Funcionario"%>
<%@page import="br.com.fam.dao.FuncionarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Alterar Funcionario</title>
	<link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
	<%
	FuncionarioDAO DAO = new FuncionarioDAO();
	int re = Integer.parseInt(request.getParameter("re"));
	
	Funcionario f = DAO.getByRe(re);
	
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	String dataAdmissao = format.format(f.getDataAdmissao());
	%>

	<h2>Alterar Funcionario</h2>

	<form action="http://localhost:9000/FAM/gravarAlteracao">
	
	RE: <input type="text" name='re' value='<%=f.getRe()%>'/>
	Nome: <input type="text" name='nome' value='<%=f.getNome()%>'/>
	Data de Admissão: <input type="text" name='dataAdmissao' value='<%=dataAdmissao%>'/>
	Salário: <input type="text" name='salario' value='<%=f.getSalario()%>'/>
	
	<input type='submit' value='enviar'/>
	
	</form>
	
	<br>
	
	<a href="http://localhost:9000/FAM/Funcionario/lista.jsp">Tabela funcionarios</a>
	<a href="http://localhost:9000/FAM/Funcionario/">Menu Inicial</a>
	
</body>
</html>