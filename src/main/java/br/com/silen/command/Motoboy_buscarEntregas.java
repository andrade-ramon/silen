package br.com.silen.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.silen.entregas.Entrega;

public class Motoboy_buscarEntregas implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		EntregasService EntregaService = new EntregasService();
//		String entregador = "motoboy3";
		System.out.println("PASSEI AQUI...");
		System.out.println("....");
		
//		List <Entregas> entregas = EntregaService.carregarEntregas(entregador);
		List <Entrega> entregas = new ArrayList<>();
		
		Entrega entrega = new Entrega();
		entrega.setIdEntrega(1);
		entrega.setQuantidade(1);
		entrega.setPeso(1);
//		Entregas.setEntregador(rs.getString("entregador"));
		entrega.setContato("Ramon");
		entrega.setTelefone("787");
		entrega.setIdStatus(1);
		entrega.setDataEnvio("10/10/2017");
		entrega.setDataRetirada("10/10/2017");
		entregas.add(entrega);
		
		request.setAttribute("entregas", entregas);
		request.getRequestDispatcher("motoboy_entregas.jsp").forward(request, response);
	}

}
