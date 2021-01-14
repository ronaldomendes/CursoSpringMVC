<%@page errorPage="myerrorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de error</title>
</head>
<body>

	<h1>
		<%
			out.print("Hoje é: " + java.util.Calendar.getInstance().getTime());
			int i = 100 / 0;
		%>
	</h1>

</body>
</html>