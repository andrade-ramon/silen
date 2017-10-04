<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Livro Inserido</title>
	</head>
	<body>
		<p>Cliente atualizado com sucesso.</p>
		
		<table>
			<thead>
					<tr>
                         <th></th>
                         <th>ID</th>
                         <th>Nome Cliente</th>
                         <th>CPF/CNPJ</th>
                         <th>email</th>
                         <th>Estado</th>
                         <th>Tipo Contrato</th>
                     </tr>
			</thead>
			<tbody>
					<tr>
						<td>${cliente.idCliente}</td>
						<td>${cliente.nomeCliente}</td>
						<td>${cliente.CPFCNPJ}</td>
						<td>${cliente.email}</td>
						<td>${cliente.estadoCliente}</td>
						<td>${cliente.idTipoContrato}</td>
					</tr>
			</tbody>
		</table>
	</body>
</html>