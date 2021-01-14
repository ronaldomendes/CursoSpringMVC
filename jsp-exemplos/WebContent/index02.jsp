<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de out</title>
</head>
<body>

	<h1>
		<%
			out.print("Hoje é: " + java.util.Calendar.getInstance().getTime());
		%>
	</h1>

</body>
</html>