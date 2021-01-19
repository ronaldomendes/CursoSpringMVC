<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<head>
    <meta charset="utf-8"/>
    <title>Cadastro de Despesa</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap-datepicker.standalone.min.css" />
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <style>
        span.error {color: red;}
    </style>
</head>
<body>

<nav class="navbar bg-light navbar-light"></nav>

<c:if test="${!empty mensagem}">
    <div class="alert alert-success">
        <span>${mensagem}</span>
    </div>
</c:if>

<form:form class="form-horizontal" method="post" action="/despesas/salvar" modelAttribute="despesa">
    <div class="card">
        <div class="card-header">
            <div class="clearfix">
                <h4 class="card-title">Nova Despesa</h4>
                <a class="btn btn-link float-right" href="/logout">Logout</a>
                <a class="float-right btn btn-outline-primary" href="/despesas">Listar Despesas</a>
            </div>
        </div>
        <div class="card-body">
            <form:hidden path="id"/>
            <div class="form-group">
                <label for="descricao" class="col-sm-2 control-label">Descrição</label>
                <div class="col-sm-6">
                    <form:input class="form-control" path="descricao"/>
                    <form:errors path="descricao" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label for="categoria" class="col-sm-2 control-label">Categoria</label>
                <div class="col-sm-6">
                    <form:select class="form-control" path="categoria">
                        <form:options/>
                    </form:select>
                </div>
            </div>

            <div class="form-group">
                <label for="data" class="col-sm-2 control-label">Data</label>
                <div class="col-sm-6">
                    <form:input class="form-control" path="data"
                                autocomplete="off"
                                data-provide="datepicker"
                                data-date-format="dd/mm/yyyy"
                                data-date-language="pt-BR"
                                data-date-autoclose="true"
                                data-date-todayHighlight="true"
                                data-date-orientation="bottom"/>
                    <form:errors path="data" cssClass="error"/>
                </div>
            </div>

            <div class="form-group">
                <label for="valor" class="col-sm-2 control-label">Valor</label>
                <div class="col-sm-6">
                    <form:input class="form-control" id="moeda" path="valor"/>
                    <form:errors path="valor" cssClass="error"/>
                </div>
            </div>

            <div class="form-group">
                <label for="observacoes" class="col-sm-2 control-label">Observações</label>
                <div class="col-sm-6">
                    <form:input class="form-control" path="observacoes"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-success">Salvar</button>
                    <button type="reset" class="btn btn-danger">Cancelar</button>
                </div>
            </div>
        </div>
    </div>
</form:form>
<script src="/js/jquery-3.5.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/bootstrap-datepicker.min.js"></script>
<script src="/js/bootstrap-datepicker.pt-BR.min.js"></script>
<script src="/js/jquery.maskMoney.min.js"></script>
<script src="/js/despesas.js"></script>
</body>
</html>