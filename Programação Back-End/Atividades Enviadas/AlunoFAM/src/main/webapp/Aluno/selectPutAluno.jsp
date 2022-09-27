<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./global.css">
	<title>Editar Aluno</title>
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
	<main>
		<h2>Editar Aluno</h2>
	
		<form action="putAluno.jsp">
			<div> Indique o RA do aluno: <input type='text' name='ra'/> </div>
			<button type='submit' value='enviar'>Alterar</button>
		</form>
		
		<a class="a" href="/AlunoFAM/Aluno/">Voltar</a>
	</main>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>