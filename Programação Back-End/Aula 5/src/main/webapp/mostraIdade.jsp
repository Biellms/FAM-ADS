<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Mostra Idade</title>
	<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
	<h2>Parâmetro recebido:</h2>
	<p>A idade é ${param.idade}</p>
	<jsp:useBean id="funcionario" class="br.com.fam.pojo.Funcionario"></jsp:useBean>
	<p>${funcionario.nome}</p>
</body>
</html>