<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>
    <meta charset="utf-8"/>
    <title>Listagem de Despesas</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
</head>
<body>
<nav class="navbar bg-light navbar-light"></nav>

<div class="card">
    <div class="card-header">
        <div class="clearfix">
            <h4 class="card-title">Listagem de Despesas</h4>
            <a class="float-right btn btn-outline-primary" href="/despesas/form">Nova Despesa</a>
        </div>
    </div>

    <div class="card-body">
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="text-center">#</th>
                <th class="text-center">Descrição</th>
                <th class="text-center">Categoria</th>
                <th class="text-center">Data</th>
                <th class="text-center">Valor</th>
                <th class="text-center">Observações</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${despesas}" var="despesa">
                <tr>
                    <td class="text-center">${despesa.id}</td>
                    <td class="text-left">${despesa.descricao}</td>
                    <td class="text-center">${despesa.categoria.nome}</td>
                    <td class="text-center">${despesa.data}</td>
                    <td class="text-right"><fmt:formatNumber
                            value="${despesa.valor}" type="currency"/></td>
                    <td class="text-left">${despesa.observacoes}</td>
                </tr>
            </c:forEach>
            <c:if test="${despesas.isEmpty()}">
                <tr>
                    <td class="text-center" colspan="6"><i>NENHUMA DESPESA
                        FOI ENCONTRADA.</i></td>
                </tr>
            </c:if>
            </tbody>
        </table>
    </div>
</div>
<script src="../js/jquery-3.5.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</body>
</html>