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
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/nifty.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/demo/nifty-demo-icons.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/demo/nifty-demo.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/plugins/morris-js/morris.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/plugins/magic-check/css/magic-check.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/plugins/pace/pace.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/plugins/themify-icons/themify-icons.min.css" rel="stylesheet">

	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/nifty.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/demo/nifty-demo.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/MascaraValidacao.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/system.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/pace/pace.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/pace/pace.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/morris-js/raphael-js/raphael.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>

	<link href="${pageContext.request.contextPath}/css/system.css" rel="stylesheet">
	
</head>

<body>
	<div id="container" class="effect aside-float aside-bright mainnav-lg">
		<%@include file="../header.jsp" %>

		<div class="boxed">
			<div id="content-container">
			    
			    <div id="page-title">
			        <h1 class="page-header text-overflow">Clientes</h1>
			    </div>

				<div id="page-content" >
					<div class="row">
					    <div class="col-sm-12">
					        <div class="panel">
					        	<div class="panel-body">
					                <div class="table-responsive">
					                    <table class="table toggle-circle tablet breakpoint no-paging footable-loaded footable">
					                        <thead>
					                           <tr>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font></font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>ID</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Nome</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>CPF/CNPJ</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>SEXO</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Telefone</font></font></th>				                                
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Endereco</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Número</font></font></th>
					                                <th class="footable-visible footable-first-column footable-sortable"><font><font>CEP</font></font></th>
					                            </tr>
					                        </thead>
					                        <tbody>
						                        <c:forEach items="${clients}" var="client">
													<tr>
														<td class="text-center">
															<a href="/cliente/${client.id}" class="btn btn-hover-warning ti-pencil-alt add-tooltip"></a>
															<a href="/cliente/${client.id}/excluir" class="btn btn-hover-danger ti-trash add-tooltip"></a>
														</td>
														<td>${client.id}</td>
														<td>${client.nome}</td>
														<td>${client.cpf}</td>
														<td>${client.sexo}</td>
														<td>${client.telefone}</td>
														<td>${client.endereco}</td>
														<td>${client.enderecoNumero}</td>
														<td>${client.cep}</td>
													</tr>
												</c:forEach>
					                        </tbody>
					                    </table>

					                    <a href="/cliente" class="btn btn-info pull-right">Cadastrar novo cliente</a>
					                </div>
								</div>
					        </div>
					    </div>
				    </div>
				</div><!--/page-content-->
			</div><!--/content-container-->
		</div><!--/boxed-->

		<%@include file="../menu_lateral.jsp" %>

		<%@include file="../footer.html" %>
	</div><!--/container-->
</body>
</html>