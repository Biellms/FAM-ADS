<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./global.css">
	<title>Cadastrar Aluno</title>
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
	
	<main>
		<form action="../PostAlunoServlet">
			RA: <input type="text" name="ra">
			Nome: <input type="text" name="nome">
			E-mail: <input type="text" name="email">
			Data de Nascimento: <input type="text" name="dataNasc">
			Renda: <input type="text" name="renda">
			
			<input type="submit" value="enviar" />
			
		</form>
		
		<a href="/AlunoFAM/Aluno/">Voltar</a>
	</main>

	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>