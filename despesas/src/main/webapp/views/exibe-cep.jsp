<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<head>
    <meta charset="utf-8"/>
    <title>Consulta de CEP</title>
    <link rel="stylesheet" type="text/css" href="${context}/css/bootstrap.min.css"/>
</head>
<body>

<nav class="navbar bg-light navbar-light"></nav>

<form:form class="form-horizontal" method="post" action="${context}/cep/util/consulta" modelAttribute="cep">
    <div class="card">
        <div class="card-header">
            <div class="clearfix">
                <h4 class="card-title impacta-titulo-panel"> Consulta CEP</h4>
                <a class="btn btn-link float-right" href="${context}/logout">Logout</a>
            </div>
        </div>
        <div class="card-body">
            <div class="form-group">
                <label for="cep" class="col-sm-2 control-label">CEP</label>
                <div class="col-sm-2">
                    <form:input  class="form-control" path="cep"/>
                </div>
            </div>

            <div class="form-group">
                <label for="address" class="col-sm-4 control-label">Endereço</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control" path="address"/>
                </div>
            </div>

            <div class="form-group">
                <label for="district" class="col-sm-4 control-label">Município</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control" path="district"/>
                </div>
            </div>

            <div class="form-group">
                <label for="city" class="col-sm-4 control-label">Cidade</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control" path="city"/>
                </div>
            </div>

            <div class="form-group">
                <label for="state" class="col-sm-4 control-label">Estado</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control" path="state"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Consultar</button>
                </div>
            </div>
        </div>
    </div>
</form:form>
<script src="${context}/js/jquery-3.1.1.min.js"></script>
<script src="${context}/js/bootstrap.min.js"></script>
</body>
</html>