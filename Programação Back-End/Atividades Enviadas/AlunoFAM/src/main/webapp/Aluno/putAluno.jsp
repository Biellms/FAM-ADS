<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.aluno.model.Aluno"%>
<%@page import="com.aluno.dao.AlunoDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fam" %>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./global.css">
	<title>Alterar Aluno</title>
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
	
</head>
<body>
	<% 
		AlunoDAO dao = new AlunoDAO();
		Long ra = Long.parseLong(request.getParameter("ra"));
		
		Aluno a = dao.getByRa(ra);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataNasc = format.format(a.getDataNasc());
	%>

	<jsp:include page="./navbar.jsp"></jsp:include>
	<main>
		<h2>Editar Aluno</h2>
	
		<form action="../PutAlunoServlet">
			<div class="input">
				RA: <input type="text" name="ra" value="<%=a.getRa()%>" />
			</div>
			<div class="input">
				Nome: <input type="text" name="nome" value="<%=a.getNome()%>" />
			</div>
			<div class="input">
				E-mail: <input type="text" name="email" value="<%=a.getEmail()%>" />
			</div>
			<div class="input">
				Data de Nascimento: <fam:campoData id="dataNasc" value="<%=dataNasc%>" />
			</div>
			<div class="input">
				Renda: <input type="text" name="renda" value="<%=a.getRenda()%>" />
			</div>
			<input type="submit" value="Confirmar"/>
		</form>
		
		<a class='a' href="/AlunoFAM/Aluno/">Voltar</a>
	</main>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>