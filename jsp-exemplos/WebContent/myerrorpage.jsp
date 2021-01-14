<%@ page language="java" isErrorPage="true" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de error</title>
</head>
<body>
	<%
		String msg = "Lamentamos, mas ocorreu um erro";		
		out.println(msg + ": " + exception.getMessage());
	%>
</body>
</html>