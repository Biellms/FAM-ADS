<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./global.css">
	<title>Deletar Aluno</title>
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
	
	<main>
		<h2>Deletar Aluno</h2>
	
		<form action="../DeleteAlunoServlet">
			<div class="input">
				RA: <input type="text" name="ra">
			</div>
			<button type="submit" value="enviar">Deletar</button>
		</form>
		
		<a class="a" href="/AlunoFAM/Aluno/">Voltar</a>
	</main>

	<jsp:include page="./footer.jsp"></jsp:include>
</body>