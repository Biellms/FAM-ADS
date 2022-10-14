<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fam" %>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./global.css">
	<title>Cadastrar Aluno</title>
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
	
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
	
	<main>
		<h2>Cadastrar Aluno</h2>
		
		<form id="postAluno" action="../PostAlunoServlet">
			<div class="input">
				RA: <input type="text" name="ra" />
			</div>
			<div class="input">
				Nome: <input type="text" name="nome" />
			</div>
			<div class="input">
				E-mail: <input type="text" name="email" />
			</div>
			<div class="input">
				Data de Nascimento: <fam:campoData id="dataNasc" />
			</div>
			<div class="input">
				Renda: <input type="text" name="renda" />
			</div>
			<input type="submit" value="Cadastrar"/>
		</form>
		
		<a class="a" href="/AlunoFAM/Aluno/">Voltar</a>
	</main>

	<jsp:include page="./footer.jsp"></jsp:include>
</body>