<%@page import="com.aluno.model.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="com.aluno.dao.AlunoDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
	<meta charset="UTF-8">
	<title>Tabela Alunos</title>
	<link rel="stylesheet" type="text/css" href="./global.css">
</head>
<body>
	<jsp:useBean id="dao" class="com.aluno.dao.AlunoDAO"/>
	<jsp:include page="./navbar.jsp"></jsp:include>
	<main>
		<h2>Tabela Alunos</h2>
	
		<table>
		
		<tr class="thead">
		<th>RA</th><th>Nome</th><th>Email</th><th>Data de Nascimento</th><th>Renda</th>
		</tr>
		
		<c:forEach var='aluno' items='${dao.lista}' varStatus="id">
			<tr bgcolor="#${id.count%2==0?'e6e6e6':'ffffff'}">
				<td>${aluno.ra}</td>
				<td>${aluno.nome}</td>
				<td>
					<c:if test="${not empty aluno.email}">${aluno.email}</c:if>
					<c:if test="${empty aluno.email}"><span style="color: red">N/A</span></c:if>
				</td>
				<td><fmt:formatDate value="${aluno.dataNasc}" pattern="dd/MM/yyyy"/></td>
				<td><fmt:formatNumber value="${aluno.renda}" type="currency"/></td>
			</tr>
		</c:forEach>
		
		</table>
		
		<a class="a" href="/AlunoFAM/Aluno/">Voltar</a>
	</main>	
	<jsp:include page="./footer.jsp"></jsp:include>
</body>