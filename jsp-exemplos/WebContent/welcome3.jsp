<%@ page language="java" isErrorPage="true" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de session</title>
</head>
<body>
	<%
		String name = request.getParameter("uname");
		out.print("Bem vindo " + name);

		session.setAttribute("user", name);
		
		System.out.println(exception);
	%>
	<a href="outra.jsp">Outra página jsp</a>
</body>
</html>