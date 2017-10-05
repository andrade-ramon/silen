
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="br.com.silen.to.*"%>
<%@ page import="br.com.silen.model.*"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt">
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Consulta Usuario</title>

</head>
<body>

	<script>
		function detalhar(cpfUsuario) {
			document.getElementById("idDetalhes").value = cpfUsuario;
			document.getElementById("formDetalhes").submit();
		}
	</script>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>Consulta de Usuarios</h1>
			<p>Informe os dados para consulta ou deixe em branco para buscar
				todos os usuario</p>
		</div>
		<form method="post" action="consultaUsuario.do">
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label>Id: </label> <input type="text" class="form-control"
							name="cpfUsuario">
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-success">Consultar</button>

		</form>
		<br> <br> <br>
		<%
			//Verifica se ja foi realizado uma consulta
				if(request.getAttribute("listaUsuarios") != null)
				{
			UsuarioTO usuarioTO = (UsuarioTO)request.getAttribute("listaUsuarios");
			ArrayList<Usuario> lista = usuarioTO.getLista();
			int tam = lista.size();
			
			if(tam == 0)
			{
				out.println("<h3>A busca não retornou resultados :/</h3>");
				
			}
			else
			{
				out.println("<table class='table table-hover'>");
				out.println("<thead>");
				out.println("<tr>");
				out.println("<th>Nome</th>");
				out.println("<th>CPF</th>");
				out.println("<th>DataNascimento</th>");
				out.println("<th>Telefone Residencial</th>");
				out.println("<th>Telefone Celular</th>");
				out.println("<th>Telefone Recado</th>");
				out.println("<th>Endereco</th>");
				out.println("<th>Complemento</th>");
				out.println("<th>Cep</th>");
				out.println("<th>Bairro</th>");
				out.println("<th>Cidade</th>");
				out.println("<th>Estado</th>");
				out.println("<th>Numero</th>");
				out.println("</tr>");
				out.println("</thead>");
				out.println("<tbody>");
				
				for(int i = 0; i < tam; i++)
				{
			out.println("<tr>");
			out.println("<td>" + lista.get(i).getNomeUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getCPF() + "</td>");
			out.println("<td>" + lista.get(i).getDataNascimento() + "</td>");
			out.println("<td>" + lista.get(i).getTelResidencial() + "</td>");
			out.println("<td>" + lista.get(i).getTelCelular() + "</td>");
			out.println("<td>" + lista.get(i).getTelRecado() + "</td>");
			out.println("<td>" + lista.get(i).getEnderecoUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getComplementoUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getCepUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getBairroUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getCidadeUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getEstadoUsuario() + "</td>");
			out.println("<td>" + lista.get(i).getNumeroUsuario() + "</td>");

			//out.println("<td><span class='glyphicon glyphicon-share'></span> ");
			out.println("<td><button type=\"button\" onClick=\"detalhar(" + 
				lista.get(i).getCPF() + 
				")\" class=\"btn btn-primary btn-sm\"><span class=\"glyphicon glyphicon-edit\"></span> Detalhes</button></td>");
			//out.println("<td>" + lista.get(i).getId() + "</td>");
			out.println("</tr>");
			
				}
				
				out.println("</tbody>");
				out.println("</table>");
				
				
				
			}

				}
		%>
	</div>
	<form id="formDetalhes" method="get" action="detalhes.do">
		<input id="idDetalhes" type="hidden" name="cpfUsuario">
	</form>
</body>
</html>