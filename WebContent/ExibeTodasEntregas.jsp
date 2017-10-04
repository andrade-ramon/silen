<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="br.com.silen.model.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>SILEN - Sistema Logística de entrega</title>

  <!--STYLESHEET-->
  <!--=================================================-->

  <!--Open Sans Font [ OPTIONAL ]-->
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>

  <!--Bootstrap Stylesheet [ REQUIRED ]-->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!--Nifty Stylesheet [ REQUIRED ]-->
  <link href="css/nifty.min.css" rel="stylesheet">

  <!--Nifty Premium Icon [ DEMONSTRATION ]-->
  <link href="css/demo/nifty-demo-icons.min.css" rel="stylesheet">

  <!--Demo [ DEMONSTRATION ]-->
  <link href="css/demo/nifty-demo.min.css" rel="stylesheet">

  <!--Morris.js [ OPTIONAL ]-->
  <link href="plugins/morris-js/morris.min.css" rel="stylesheet">

  <!--Magic Checkbox [ OPTIONAL ]-->
  <link href="plugins/magic-check/css/magic-check.min.css" rel="stylesheet">
  
  <!--Themify Icon-->
  <link href="plugins/themify-icons/themify-icons.min.css" rel="stylesheet">

  <!--JAVASCRIPT-->
  <!--=================================================-->

  <!--Pace - Page Load Progress Par [OPTIONAL]-->
  <link href="plugins/pace/pace.min.css" rel="stylesheet">
  <script src="plugins/pace/pace.min.js"></script>

  <!--jQuery [ REQUIRED ]-->
  <script src="js/jquery.min.js"></script>

  <!--BootstrapJS [ RECOMMENDED ]-->
  <script src="js/bootstrap.min.js"></script>

  <!--NiftyJS [ RECOMMENDED ]-->
  <script src="js/nifty.min.js"></script>

  <!--=================================================-->
  <!--Demo script [ DEMONSTRATION ]-->
  <script src="js/demo/nifty-demo.min.js"></script>

  <!--Morris.js [ OPTIONAL ]-->
  <script src="plugins/morris-js/morris.min.js"></script>
  <script src="plugins/morris-js/raphael-js/raphael.min.js"></script>

  <!--Sparkline [ OPTIONAL ]-->
  <script src="plugins/sparkline/jquery.sparkline.min.js"></script>

  <!--Specify page [ SAMPLE ]-->
  <script src="js/MascaraValidacao.js"></script>
  
  <script src="js/demo/icons.js"></script>
  <!-- Scripts criados-->
<script src="js/system.js"></script>

</head>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Resultado Pesquisa</title>
	</head>
	<body>
	
		<div class="boxed">
	    	<div id="content-container">
	    		<div id="page-content">
	     			<div class="row">
					    <div class="col-sm-12">
					        <div class="panel">
					        
					        <div class="panel-body">
						                <div class="table-responsive">
						                    <table class="table toggle-circle tablet breakpoint no-paging footable-loaded footable">
						                        <thead>
						                             <tr>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font></font></font></th>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Id Entrega</font></font></th>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Quantidade</font></font></th>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Peso</font></font></th>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Contato</font></font></th>
						                                <th class="footable-visible footable-first-column footable-sortable"><font><font>Entregador</font></font></th>
						                                
						                            </tr> 
						                        </thead>
						                        <tbody>
						                        	<c:forEach items="${entregas}" var="entregas">
														<tr>
															 <td class="text-center"> 
																<button type="submit" name="command" class="btn btn-hover-warning ti-pencil-alt add-tooltip" data-toggle="tooltip" data-container="body" data-placement="top" data-original-title="Atualizar" value="AtualizarCliente" onclick="Atualizar(${entregas.idEntrega})"></button>
																<button type="submit" name="command" class="btn btn-hover-danger ti-trash add-tooltip" data-toggle="tooltip" data-container="body" data-placement="top" data-original-title="Excluir" value="ApagarCliente" onclick="Excluir(${entregas.idEntrega})"></button>
															</td>
															<td>${entregas.idEntrega}</td>
															<td>${entregas.quantidade}</td>
															<td>${entregas.peso}</td>
															<td>${entregas.contato}</td>
															<td>${entregas.entregador}</td>
														</tr>
													</c:forEach>
						                        </tbody>
						                    </table>
						                </div>
						            </div>
					        </div>
					    </div>
				    </div>
			    </div>
		    </div>
	    </div>
    </body>
</html>