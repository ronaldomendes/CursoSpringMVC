<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<head>
    <meta charset="utf-8"/>
    <title>Listagem de Despesas</title>
    <link rel="stylesheet" type="text/css" href="${context}/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${context}/css/style.css"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
</head>
<body>
<nav class="navbar bg-light navbar-light"></nav>

<div class="card">
    <div class="card-header">
        <div class="clearfix">
            <h4 class="card-title">Listagem de Despesas</h4>
            <a class="btn btn-link float-right" href="${context}/logout">Logout</a>
            <sec:authorize access="hasRole('MASTER')">
                <a class="float-right btn btn-outline-primary" href="${context}/despesas/form">Nova Despesa</a>
            </sec:authorize>
        </div>
    </div>

    <div class="card-body">

        <form method="GET" class="form-horizontal" action="${context}/despesas">
            <div class="form-group">
                <div class="col-sm-4">
                    <div class="input-group">
                        <input class="form-control" placeholder="Busca por descrição..."
                               autocomplete="off" autofocus="autofocus" name="descricao"/>
                    </div>
                </div>
            </div>
        </form>

        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="text-center">#</th>
                <th class="text-center">Descrição</th>
                <th class="text-center">Categoria</th>
                <th class="text-center">Data</th>
                <th class="text-center">Valor</th>
                <th class="text-center">Observações</th>
                <th colspan="2" class="text-center">Ações</th>
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
                    <td class="text-center">
                        <a class="btn btn-link btn-xs"
                           data-toggle="modal"
                           data-target="#confirmaRemocaoModal"
                           data-whatever="${despesa.id}">
                            <span class="material-icons">delete</span>
                        </a>
                    </td>
                    <td class="text-center">
                        <a href="${context}/despesas/form/${despesa.id}" class="btn btn-link btn-xs">
                            <span class="material-icons">edit</span>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            <c:if test="${despesas.isEmpty()}">
                <tr>
                    <td class="text-center" colspan="7"><i>NENHUMA DESPESA FOI ENCONTRADA.</i></td>
                </tr>
            </c:if>
            </tbody>
        </table>
    </div>
    <div class="modal fade" id="confirmaRemocaoModal" tabindex="-1"
         data-keyboard="false" data-backdrop="static">
        <div class="modal-dialog">
            <form action="${context}/despesas" method="POST">
                <input type="hidden" name="_method" value="DELETE" />
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Confirmação</h4>
                    </div>

                    <div class="modal-body">
                        <span>Deseja realmente remover a despesa?</span>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
                        <button type="submit" class="btn btn-danger">Confirmar</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="${context}/js/jquery-3.5.1.min.js"></script>
<script src="${context}/js/bootstrap.min.js"></script>
<script src="${context}/js/despesas.js"></script>
</body>
</html>