<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina JSP</title>
<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
	<div class="container">
		<div>
			<h1>HELLO WORLD JSP</h1>
			<%
				String text = "Texto teste";
			
				out.println(text);
				System.out.println("Executado!");
			%>
			
			<%=text %>
		</div>
	</div>
<!-- Coment�rio JSP -->

</body>
</html>