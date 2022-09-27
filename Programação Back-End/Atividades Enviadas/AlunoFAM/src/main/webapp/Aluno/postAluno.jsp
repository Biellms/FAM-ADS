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
		<h2>Cadastrar Aluno</h2>
		
		<form action="../PostAlunoServlet">
			<div class="input">
				RA: <input type="text" name="ra">
			</div>
			<div class="input">
				Nome: <input type="text" name="nome">
			</div>
			<div class="input">
				E-mail: <input type="text" name="email">
			</div>
			<div class="input">
				Data de Nascimento: <input type="text" name="dataNasc">
			</div>
			<div class="input">
				Renda: <input type="text" name="renda">
			</div>
			<button type="submit" value="enviar">Cadastrar</button>
		</form>
		
		<a class="a" href="/AlunoFAM/Aluno/">Voltar</a>
	</main>

	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>