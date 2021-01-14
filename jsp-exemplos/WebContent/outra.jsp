<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de request</title>
</head>
<body>
	<%
		String name = session.getAttribute("user").toString();
		out.print("Bem vindo a outra página: " + name);
	%>
</body>
</html>