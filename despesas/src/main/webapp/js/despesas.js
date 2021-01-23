/**
 * Baseado no exemplo de javascript de modal do Bootstrap
 * acesse: http://getbootstrap.com/javascript/#modals-related-target
 */
$('#confirmaRemocaoModal').on('show.bs.modal', function (event) {
    var button = $(event.relatedTarget);

    var codigo = button.data('whatever');

    var modal = $(this);
    var form = modal.find('form');
    var action = '/despesas/';
    form.attr('action', getContextPath() + action + codigo);

    modal.find('.modal-body span').html('Tem certeza que deseja excluir a despesa <strong>' + codigo + '</strong>?');
});

$(function () {
    $('#moeda').maskMoney({decimal: ',', thousands: '.', allowZero: true})
});

function getContextPath() {
    const path = window.location.pathname;
    return path.substring(0, path.indexOf("/", 2));
}