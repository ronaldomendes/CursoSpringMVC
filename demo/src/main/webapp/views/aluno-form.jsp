<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibindo Categoria Informada</title>
</head>
<body>
	<form:form action="/aluno/registra" modelAttribute="aluno">
		Nome: <form:input path="nome" />
		Sobrenome: <form:input path="sobrenome" />
		<br><br>
		<input type="submit" value="Registrar"/>
	</form:form>
</body>
</html>