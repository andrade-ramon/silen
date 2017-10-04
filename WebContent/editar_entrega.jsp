<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/nifty.min.css" rel="stylesheet">
	<link href="css/demo/nifty-demo-icons.min.css" rel="stylesheet">
	<link href="css/demo/nifty-demo.min.css" rel="stylesheet">
	<link href="plugins/morris-js/morris.min.css" rel="stylesheet">
	<link href="plugins/magic-check/css/magic-check.min.css" rel="stylesheet">
	<link href="plugins/pace/pace.min.css" rel="stylesheet">
	<link href="plugins/themify-icons/themify-icons.min.css" rel="stylesheet">

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/nifty.min.js"></script>
	<script src="js/demo/nifty-demo.min.js"></script>
	<script src="js/MascaraValidacao.js"></script>
	<script src="js/jquery.mask.min.js"></script>
	<script src="js/system.js"></script>
	<script src="plugins/pace/pace.min.js"></script>
	<script src="plugins/pace/pace.min.js"></script>
	<script src="plugins/morris-js/raphael-js/raphael.min.js"></script>
	<script src="plugins/sparkline/jquery.sparkline.min.js"></script>

	<script src="js/entregas.js"></script>
	<link href="css/system.css" rel="stylesheet">
	
</head>

<body>
	<div id="container" class="effect aside-float aside-bright mainnav-lg">
		<%@include file="header.jsp" %>

		<div class="boxed">
			<div id="content-container">
			    
			    <div id="page-title">
			        <h1 class="page-header text-overflow">Editar entrega</h1>
			    </div>

				<div id="page-content">
					<div class="row">
						<div class="col-md-12">
							
							<div class="panel">	
								<form class="form-horizontal" action="FrontController" method="post">
								    <div class="panel-body">
								        <p class="bord-btm pad-ver text-main text-bold">Remetente</p>
								        <div class="row">
								            <div class="col-md-2">
								                <label class="control-label">Id:</label>
								                <input class="form-control" value="${entrega.idEntrega}" type="number" name="idRemetente" id="idRemetente" maxlength="20" readonly disable >
								            </div>
											<div class="col-md-2">
								                <label class="control-label">CPF/CNPJ:</label>
								                <input class="form-control" type="number" name="nrDocumentRemetente" id="nrDocumentRemetente" maxlength="20" >
								            </div>
								            <div class="col-md-4">
								                <label class="control-label">Remetente:</label>
								                <input class="form-control" type="text" name="nomeRemetente" id="nomeRemetente" maxlength="20" >
								            </div>
								        </div>

								        <div class="row">								
								            <div class="col-md-3">
								                <label class="control-label">Endereço:</label>
								                <input class="form-control"type="text" name="txtEnderecoRemetente" id="txtEnderecoRemetente" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-1">
								                <label class="control-label">Número:</label>
								                <input class="form-control"type="text" name="txtNumeroRemetente" id="txtNumeroRemetente" maxlength="10" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Complemento:</label>
								                <input class="form-control"type="text" name="txtComplementoRemetente" id="txtComplementoRemetente" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Bairro:</label>
								                <input class="form-control"type="text" name="txtBairroRemetente" id="txtBairroRemetente" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Cidade:</label>
								                <input class="form-control"type="text" name="txtCidadeRemetente" id="txtCidadeRemetente" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Estado:</label>
								                <input class="form-control" type="text" id="txtEstadoRemetente" name="txtEstadoRemetente" maxlength="100" readonly disable>
								            </div>                             
								        </div>

								        
								        <p class="bord-btm pad-ver text-main text-bold">Destinatário</p>
								        <div class="row">									
								            <div class="col-md-2 ">
								                <label class="control-label">Id:</label>
								                <input class="form-control" type="number" name="idDestinatario" id="idDestinatario" maxlength="20" >
								            </div>
								            <div class="col-md-2 ">
								                <label class="control-label">CPF/CNPJ:</label>
								                <input class="form-control" type="number" name="nrDocumentDestinatario" id="nrDocumentDestinatario" maxlength="20" >
								            </div>

								            <div class="col-md-4 ">
								                <label class="control-label">Destinatario:</label>
								                <input class="form-control" type="text" name="nomeDestinatario" id="nomeDestinatario" maxlength="20" >
								            </div>
								        </div>
								        
								        <div class="row">
								            <div class="col-md-3 ">
								                <label class="control-label">Endereço:</label>
								                <input class="form-control" type="text" name="txtEnderecoDestinatario" id="txtEnderecoDestinatario" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-1">
								                <label class="control-label">Número:</label>
								                <input class="form-control"type="text" name="txtNumeroDestinatario" id="txtNumeroDestinatario" maxlength="10" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Complemento:</label>
								                <input class="form-control"type="text" name="txtComplementoDestinatario" id="txtComplementoDestinatario" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Bairro:</label>
								                <input class="form-control"type="text" name="txtBairroDestinatario" id="txtBairroDestinatario" maxlength="100"  readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Cidade:</label>
								                <input class="form-control"type="text" name="txtCidadeDestinatario" id="txtCidadeDestinatario" maxlength="100" readonly disable>
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Estado:</label>
								                <input class="form-control" type="text" id="txtEstadoDestinatario" name="txtEstadoDestinatario" maxlength="10" readonly disable>
								            </div>
								        </div>

								        <p class="bord-btm pad-ver text-main text-bold">Dados Gerais</p>
								        <div class="row">
								            <div class="col-md-2">
								                <label class="control-label">Id Entrega:</label>
								                <input class="form-control" type="text" name="idEntrega" id="idEntrega" maxlength="20" >
								            </div>

								            <div class="col-md-2">
								                <label class="control-label">Id_Origem:</label>
								                <input class="form-control"type="number" name="idOrigem" id="idOrigem" maxlength="20" >
								            </div>

								            <div class="col-md-2">
								                <label class="control-label">Quantidade:</label><br>
								                <input class="form-control"type="number" name="Quantidade" id="Quantidade" maxlength="5" >
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Peso:</label><br>
								                <input class="form-control"type="number" name="Peso" id="Peso" maxlength="5" >
								            </div>

								            <div class="col-md-2">
								                <label class="control-label">Data Envio:</label>
								                <input class="form-control" type="text" id="dtEnvio" placeholder="DD/MM/AAAA"name="dtEnvio" maxlength="10" placeholder="01/01/1900">
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Data Entrega:</label>
								                <input class="form-control" type="text" id="dtEntrega" placeholder="DD/MM/AAAA" name="dtEntrega" maxlength="10" placeholder="01/01/1900">                                 
								                
								            </div>
								        </div>
								        
								        <div class="row">
								            <div class="col-md-2">
								                <label class="control-label">Entregador:</label><br>
								                <input class="form-control"type="text" name="txtEntregador" id="txtEntregador" maxlength="50" >
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Contato:</label><br>
								                <input class="form-control"type="text" name="txtContato" id="txtContato" maxlength="50" >
								            </div>
								            <div class="col-md-2">
								                <label class="control-label">Telefone:</label><br>
								                <input class="form-control"type="text" name="txtTelefone" id="txtTelefone" maxlength="50" placeholder="(99) 9999-9999">
								            </div>

								            <div class="col-md-2">
								                <label class="control-label">Status:</label>
								                <select class="form-control" name="status" id="statusEntrega">
								                    <option value="">Selecione</option>
								                    <option value="1">Nova</option>
								                    <option value="2">Embalando</option>
								                    <option value="3">Trânsito</option>
								                    <option value="4">Entregue</option>
								                </select>
								            </div>


								            <div class="col-md-2">
								                <label class="control-label">Tipo:</label>
								                <select class="form-control" name="tipoEntrega" id="tipoEntrega">
								                    <option value="">Selecione</option>
								                    <option value="1">Normal</option>
								                    <option value="2">Urgente</option>
								                    <option value="3">Emergencial</option>
								                </select>
								            </div>
								        </div>
								    </div>
								    
								    <div class="panel-footer text-right">

								        <div class="row form-group" >
								            <div class="col-md-1 pull-right" style="margin-right:10px" id="divCadastrar">
								                <button type="submit" class="btn btn-success" id="btnCadastro" >Salvar</button>
								            </div>
								            <div class="col-md-1  pull-left" id="divPesquisar">
								                <a href="${pageContext.request.contextPath}/entregas" class="btn btn-info">Cancelar</a>
								           </div>
								        </div>
								    </div>
								</form>
							</div>

						</div>
					</div>
				</div><!--/page-content-->			
			</div><!--/content-container-->
		</div><!--/boxed-->

		<%@include file="menu_lateral.jsp" %>

		<%@include file="footer.html" %>
	</div><!--/container-->
</body>
</html>