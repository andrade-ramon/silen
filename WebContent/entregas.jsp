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
			        <h1 class="page-header text-overflow">Entregas</h1>
			    </div>
				<div id="page-content">
					<div class="row">
						<div class="col-md-12">
							<div class="panel">
								<div class="panel-body">
							        <div class="table-responsive">
							            <table class="table toggle-circle tablet breakpoint no-paging footable-loaded footable">
							                <thead>
							                   <tr>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font></font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>ID</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Quantidade</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Peso</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Entregador</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Contato</font></font></th>				                                
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Telefone</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Data Envio</font></font></th>
							                        <th class="footable-visible footable-first-column footable-sortable"><font><font>Data Retirada</font></font></th>
							                    </tr>
							                </thead>
							                <tbody>
								                <c:forEach items="${entregas}" var="entrega">
													<tr>
														<td class="text-center">
															<a href="${pageContext.request.contextPath}/editar_entrega?idEntrega=${entrega.idEntrega}"><button type="submit" name="command" class="btn btn-hover-warning ti-pencil-alt add-tooltip" value="AtualizarEntrega"></button></a>
															<button type="submit" name="command" class="btn btn-hover-danger ti-trash add-tooltip" value="ApagarEntrega" onclick=""></button>
														</td>
														<td></td>
														<td>${entrega.quantidade}</td>
														<td>${entrega.peso}</td>
														<td></td>
														<td></td>
														<td></td>
														<td>${entrega.dataEnvio}</td>
														<td>${entrega.dataRetirada}</td>
													</tr>
												</c:forEach>
							                </tbody>
							            </table>
							        </div>
								</div>
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