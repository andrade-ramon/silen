<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	
<html lang="pt">
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cadastro</title>

</head>
<body>
	
	

    <div class="container">
    <div class="col-md-8">
        <div class="jumbotron">
        	<h1>Novo Usuario</h1>
            <p>Informe os dados do Usuario</p>
        </div>
        <span class="campo-obrigatorio">* Campo obrigatório</span><br><br>
        <form role="form" name="cadastroUsu" method="post" action="cadastroUsuario.do">
        
            <div class="form-group">
                <label>Nome: <span class="campo-obrigatorio">*</span></label>
                <input type="text" id="nomeUsuario" name="nomeUsuario" class="form-control" onkeyup="numeros( this );"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->    
                <span class="erro-form" id="erroNome"></span>
            </div>
            <div class="form-group">
                <label>CPF:</label>
                <input type="text" id="cpfUsuario" name="cpfUsuario" class="form-control" onkeypress="mascara(this, cpf_mask);" maxlength="14"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->     
                <span class="erro-form" id="erroCpf"></span>          
             </div>
             <div class="form-group">
            	<label>Nascimento: <span class="campo-obrigatorio">*</span></label>
            	<input type="date" id="dataNascimento" name="dataNascimento" class="form-control">
            	<span class="erro-form" id="erroNascimento"></span>
            </div>
             <div class="form-group">
            	<label>Telefone Resi: <span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="telResidencial" name="telResidencial" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13">
            	<span class="erro-form" id="erroTelefone"></span>
            </div>
            <div class="form-group">
            	<label>Telefone Celular: <span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="telCelular" name="telCelular" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13">
            	<span class="erro-form" id="erroTelefone"></span>
            </div>
            <div class="form-group">
            	<label>Telefone Recado: <span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="telRecado" name="telRecado" class="form-control" onkeypress="mascara(this, telefone_mask);" maxlength="13">
            	<span class="erro-form" id="erroTelefone"></span>
            </div>
             <div class="form-group">
            	<label>ENDERECO:<span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="enderecoUsuario" name="enderecoUsuario" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->
            	<span class="erro-form" id="erroRg"></span>
             </div>
             <div class="form-group">
            	<label>COMPLEMENTO:<span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="complementoUsuario" name="complementoUsuario" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->
            	<span class="erro-form" id="erroRg"></span>
             </div>
             <div class="form-group">
            	<label>Bairro:<span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="cepUsuario" name="bairroUsuario" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->
            	<span class="erro-form" id="erroRg"></span>
             </div>
             <div class="form-group">
            	<label>CEP:<span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="cepUsuario" name="cepUsuario" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->
            	<span class="erro-form" id="erroRg"></span>
             </div>
             <div class="form-group">
            	<label>CIDADE:<span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="cidadeUsuario" name="cidadeUsuario" class="form-control" onkeypress="mascara(this, rg_mask);" maxlength="11"> <!-- required oninvalid="this.setCustomValidity('Campo ObrigatÃ³rio')" -->
            	<span class="erro-form" id="erroRg"></span>
             </div>
            <div class="form-group">    
            	<label>Estado: <span class="campo-obrigatorio">*</span></label>
            	<select id="estadoUsuario" name="estadoUsuario" class="form-control">
            		<option value="NaoSelecionado">Selecione...</option>
                    <option value="AC">AC</option>
                    <option value="AL">AL</option>
                    <option value="AP">AP</option>
                    <option value="AM">AM</option>
                    <option value="BA">BA</option>
                    <option value="CE">CE</option>
                    <option value="DF">DF</option>
                    <option value="ES">ES</option>
                    <option value="GO">GO</option>
                    <option value="MA">MA</option>
                    <option value="MT">MT</option>
                    <option value="MS">MS</option>
                    <option value="MG">MG</option>
                    <option value="PR">PR</option>
                    <option value="PB">PB</option>
                    <option value="PA">PA</option>
                    <option value="PE">PE</option>
                    <option value="PI">PI</option>
                    <option value="RJ">RJ</option>
                    <option value="RN">RN</option>
                    <option value="RS">RS</option>
                    <option value="RO">RO</option>
                    <option value="RR">RR</option>
                    <option value="SC">SC</option>
                    <option value="SE">SE</option>
                    <option value="SP">SP</option>
                    <option value="TO">TO</option>
	            </select>
	            <span class="erro-form" id="erroEstado"></span>
           	</div>
            <div class="form-group">
            	<label>Numero Registro: <span class="campo-obrigatorio">*</span></label>
            	<input type="text" id="numeroUsuario" name="numeroUsuario" class="form-control" onkeyup="letras( this );">
            	<span class="erro-form" id="erroNumeroRegistro"></span>
            </div>
            <button type="submit" class="btn btn-success btn-lg">Cadastrar</button><br><br><br>
        </form>
        
		</div>
    	</div>
	</body>
</html>