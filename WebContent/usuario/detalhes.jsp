<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Usuario"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Detalhes Usuario</title>
</head>
<body>

	<script src="http://localhost:8080/silen_tcc/scripts/usuario.js"></script>
	
	<%
	
		Usuario usuario = new Usuario();
		int idUsuario = 0;
		String nomeUsuario = null;
		String cpfUsuario = null;
		String dataNascimento = null;
		String telResidencial = null;
		String telCelular = null;
		String telRecado = null;
		String endereco = null;
		String complemento = null;
		String bairro = null;
		String cidade = null;
		String estado = null;
		int numeroUsuario = 0;
		String cep = null;
				
	
		if(request.getAttribute("usuarioConsultado") != null)
		{
			usuario = (Usuario) request.getAttribute("usuarioConsultado");
			idUsuario = usuario.getIdUsuario();
			nomeUsuario = usuario.getNomeUsuario();
			cpfUsuario = usuario.getCPF();
			dataNascimento = usuario.getDataNascimento();
			telResidencial = usuario.getTelResidencial();
			telCelular = usuario.getTelCelular();
			telRecado = usuario.getTelRecado();
			endereco = usuario.getEnderecoUsuario();
			complemento = usuario.getComplementoUsuario();
			bairro = usuario.getBairroUsuario();
			cidade = usuario.getCidadeUsuario();
			estado = usuario.getEstadoUsuario();
			cep = usuario.getCepUsuario();
			numeroUsuario = usuario.getNumeroUsuario();

		}
		else
		{
			RequestDispatcher view = request.getRequestDispatcher("consulta.jsp");
			view.forward(request, response);
		}
	%>
	<div class="container">
		<%
			if(request.getAttribute("alterado") != null)
			{
				
				boolean alterado = (Boolean)request.getAttribute("alterado");
				if(alterado)
				{
					out.print("<div class='jumbotron jumb-sucesso-sm'>Usuario alterado com sucesso!</div>");
				}
				else
				{
					out.print("<div class='jumbotron jumb-alerta'>Não foi possível alterar o usuario</div>");
				}
			}
		
		//Verifica se está voltando de um erro na exclusao
		if(request.getAttribute("erroExclusao") != null)
		{
			String erro = (String)request.getAttribute("erroExclusao");
			if(erro.equals("1"))
			{
				out.print("<div class='jumbotron jumb-alerta'>Não foi possível excluir o automóvel</div>");
			}
		}
		%>
		<div class="row">
			<div class="col-md-12">
				<div class="jumbotron">
					<h1><%out.print(usuario.getNomeUsuario());%></h1>	
					<p><%out.print(usuario.getCPF());%></p>
				</div>
			</div>
		</div>
		
		
		
	<form name="cadastroUsu" method="post">
	<input type="hidden" name="cpfUsuario" value="<%out.print(usuario.getCPF());%>">
	<div class="row">
		<div class="col-md-6">
		<div class="form-group">
  			<label>Id:</label>
  			<input type="text" name="idUsario" value="<%out.print(usuario.getIdUsuario());%>" class="form-control" onkeyup="numeros( this );"/>
            <span class="erro-form" id="erroNome"></span>
   		</div>
		<div class="form-group">
  			<label>Nome:</label>
  			<input type="text" name="nomeUsario" value="<%out.print(usuario.getNomeUsuario());%>" class="form-control" onkeyup="numeros( this );"/>
            <span class="erro-form" id="erroNome"></span>
   		</div>
		<div class="form-group">
			<label>CPF:</label>
			<input type="text" name="cpfUsuario" value="<%out.print(usuario.getCPF());%>" class="form-control" onkeypress="mascara(this, cpf_mask);" maxlength="14"/>
			<span class="erro-form" id="erroCpf"></span>
		</div>
		<div class="form-group">
			<label>Data Nasc:</label>
			<input type="text" name="dataNascimento" value="<%out.print(usuario.getDataNascimento());%>" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"/>
			<span class="erro-form" id="erroRg"></span>
		</div>
   		<div class="form-group">
			<label>Telefone Resi:</label>
			<input type="text" name="telResidencial" value="<%out.print(usuario.getTelResidencial());%>" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13"/>
			<span class="erro-form" id="erroTelefone"></span>
		</div>
		<div class="form-group">
			<label>Telefone Celular:</label>
			<input type="text" name="telCelular" value="<%out.print(usuario.getTelCelular());%>" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13"/>
			<span class="erro-form" id="erroTelefone"></span>
		</div>
		<div class="form-group">
			<label>Telefone Recado:</label>
			<input type="text" name="telRecado" value="<%out.print(usuario.getTelCelular());%>" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13"/>
			<span class="erro-form" id="erroTelefone"></span>
		</div>
		<div class="form-group">
  			<label>Endereco:</label>
  			<input type="text" name="enderecoUsuario" value="<%out.print(usuario.getEnderecoUsuario());%>" class="form-control"/>
			<span class="erro-form" id="erroEmail"></span>
   		</div>
   		<div class="form-group">
  			<label>Complemento:</label>
  			<input type="text" name="complementoUsuario" value="<%out.print(usuario.getComplementoUsuario());%>" class="form-control"/>
			<span class="erro-form" id="erroEmail"></span>
   		</div>
   		<div class="form-group">
  			<label>CEP:</label>
  			<input type="text" name="cepUsuario" value="<%out.print(usuario.getCepUsuario());%>" class="form-control"/>
			<span class="erro-form" id="erroEmail"></span>
   		</div>
   		<div class="form-group">
  			<label>Cidade:</label>
  			<input type="text" name="cidadeUsuario" value="<%out.print(usuario.getCidadeUsuario());%>" class="form-control"/>
			<span class="erro-form" id="erroEmail"></span>
   		</div>
		<div class="form-group">
   			<label>Estado:</label>
   			<!-- Verifica qual a estado do automovel e coloca como selecionado se for o mesmo do option -->
   			<select name="estadoUsuario" class="form-control">
   			<option value="AC">AC</option>
                    <option value="AL" <% if(estado.equals("AL")){ out.print("selected");} %>>AL</option>
                    <option value="AP" <% if(estado.equals("AP")){ out.print("selected");} %>>AP</option>
                    <option value="AM" <% if(estado.equals("AM")){ out.print("selected");} %>>AM</option>
                    <option value="BA" <% if(estado.equals("BA")){ out.print("selected");} %>>BA</option>
                    <option value="CE" <% if(estado.equals("CE")){ out.print("selected");} %>>CE</option>
                    <option value="DF" <% if(estado.equals("DF")){ out.print("selected");} %>>DF</option>
                    <option value="ES" <% if(estado.equals("ES")){ out.print("selected");} %>>ES</option>
                    <option value="GO" <% if(estado.equals("GO")){ out.print("selected");} %>>GO</option>
                    <option value="MA" <% if(estado.equals("MA")){ out.print("selected");} %>>MA</option>
                    <option value="MT" <% if(estado.equals("MT")){ out.print("selected");} %>>MT</option>
                    <option value="MS" <% if(estado.equals("MS")){ out.print("selected");} %>>MS</option>
                    <option value="MG" <% if(estado.equals("MG")){ out.print("selected");} %>>MG</option>
                    <option value="PR" <% if(estado.equals("PR")){ out.print("selected");} %>>PR</option>
                    <option value="PB" <% if(estado.equals("PB")){ out.print("selected");} %>>PB</option>
                    <option value="PA" <% if(estado.equals("PA")){ out.print("selected");} %>>PA</option>
                    <option value="PE" <% if(estado.equals("PE")){ out.print("selected");} %>>PE</option>
                    <option value="PI" <% if(estado.equals("PI")){ out.print("selected");} %>>PI</option>
                    <option value="RJ" <% if(estado.equals("RJ")){ out.print("selected");} %>>RJ</option>
                    <option value="RN" <% if(estado.equals("RN")){ out.print("selected");} %>>RN</option>
                    <option value="RS" <% if(estado.equals("RS")){ out.print("selected");} %>>RS</option>
                    <option value="RO" <% if(estado.equals("RO")){ out.print("selected");} %>>RO</option>
                    <option value="RR" <% if(estado.equals("RR")){ out.print("selected");} %>>RR</option>
                    <option value="SC" <% if(estado.equals("SC")){ out.print("selected");} %>>SC</option>
                    <option value="SE" <% if(estado.equals("SE")){ out.print("selected");} %>>SE</option>
                    <option value="SP" <% if(estado.equals("SP")){ out.print("selected");} %>>SP</option>
                    <option value="TO" <% if(estado.equals("TO")){ out.print("selected");} %>>TO</option>
   			</select>
   			<span class="erro-form" id="erroEstado"></span>
   		</div>
   		</div> <!-- fim coluna -->   		
   		<div class="col-md-6">
		<div class="form-group">
			<label>Número Registro:</label>
			<input type="text" name="numeroUsuario" value="<%out.print(usuario.getNumeroUsuario());%>" class="form-control" onkeyup="letras( this );"/>
			<span class="erro-form" id="erroNumeroRegistro"></span>
		</div>
		
		
  		</div> <!-- fim coluna -->
		</div>

  <div class="row">
  	<div class="col-md-12 text-center">
	  		<button type="button" class="btn btn-warning" onclick="alterarUsuario()">
	  			<span class="glyphicon glyphicon-pencil"></span> Alterar
	  		</button>
	  		<button type="button" class="btn btn-danger" onclick="$('#caixaExclusao').fadeIn('fast')" >
	  			<span class="glyphicon glyphicon-trash"></span> Excluir
	  		</button>
	  		<div id="caixaExclusao" class="jumbotron jumb-exclusao">
	  			O usuario será excluído do sistema. Deseja prosseguir com a exclusão? 
	  			<button class="btn btn-default" type="button" onclick="excluirUsuario()"><b>Excluir</b></button>
	  			<button class="btn btn-default" type="button" onclick="$('#caixaExclusao').fadeOut('fast')">Cancelar</button>  			
	  		</div>
  		</div>
  </div>

   </form>
   </div>
</body>
</html>