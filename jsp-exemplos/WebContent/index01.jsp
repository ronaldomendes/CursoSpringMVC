<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de Scriptlet</title>
</head>
<body>
	<%
		String nome = "João";
		int idade = 18;

		String mensagem = String.format("%s tem %d anos.", nome, idade);
	%>

	<h1>HELLO JSP !</h1>
	<h2>
		Mensagem:
		<%=mensagem%></h2>

</body>
</html>