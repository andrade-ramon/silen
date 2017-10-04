function Excluir(idCliente){
	$("#modalDelete").modal('show');
}

function CancelarExclusao(){
	$("#modalDelete").modal('hide');
};

function Atualizar(id){
	$("#divAtualizar").show();
	$("#divCancelarAtualizacao").show();
	$("#divPesquisar").hide();
	$("#divCadastrar").hide();
}

function CancelarAtualizacao(){
	$("#divAtualizar").hide();
	$("#divCancelarAtualizacao").hide();
	$("#divPesquisar").show();
	$("#divCadastrar").show();
}
