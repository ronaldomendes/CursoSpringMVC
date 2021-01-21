<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<head>
    <meta charset="utf-8"/>
    <title>Consulta Cotação de Moeda</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
</head>
<body>

<nav class="navbar bg-light navbar-light"></nav>

<form:form class="form-horizontal" method="post" action="/despesas/util/cotacao" modelAttribute="cotacao">
    <div class="card">
        <div class="card-header">
            <div class="clearfix">
                <h4 class="card-title impacta-titulo-panel"> Consulta Cotação</h4>
                <a class="btn btn-link float-right" href="/logout">Logout</a>
            </div>
        </div>
        <div class="card-body">
            <div class="form-group">
                <label for="moeda" class="col-sm-2 control-label">Moeda</label>
                <div class="col-sm-2">
                    <form:select class="form-control" path="moeda">
                        <form:options/>
                    </form:select>
                </div>
            </div>

            <div class="form-group">
                <label for="precoVenda" class="col-sm-4 control-label">Preço de Venda</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control moeda" path="precoVenda"/>
                </div>
            </div>

            <div class="form-group">
                <label for="precoCompra" class="col-sm-4 control-label">Preço de Compra</label>
                <div class="col-sm-4">
                    <form:input disabled="true" class="form-control moeda" path="precoCompra"/>
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
<script src="/js/jquery-3.1.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.maskMoney.min.js"></script>
<script src="/js/despesas.js"></script>
</body>
</html>