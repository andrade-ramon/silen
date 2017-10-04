package br.com.silen.entregas;

import java.util.List;

public class EntregasService {
	private EntregasDAO entregasDAO;
	
	public EntregasService (){
		this.entregasDAO = new EntregasDAO();
	}
	
	public List<Entrega> listarEntregasDe(int idEntregador) {
		return entregasDAO.listarEntregasDe(idEntregador);
	}

	public List<Entrega> listarTodasEntregas() {
		return entregasDAO.listarTodasEntregas();
	}

	public Entrega findById(int idEntrega) {
		return entregasDAO.findById(idEntrega);
	}
	
//	public void criarEntrega(Entrega Entrega){
//		try {
//			EntregasDAO.criarEntrega(Entrega);
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void atualizarEntrega(Entrega Entregas){
//		try {
//			EntregasDAO.atualizarEntrega(Entregas);
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void apagarEntrega(Entrega Entregas){
//		try {
//			EntregasDAO.apagarEntrega(Entregas);
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public List <Entrega> listarCompleto(){
//		try {
//			return EntregasDAO.listarCompleto();
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//			return new ArrayList <Entrega> ();
//		}
//	}
//	
//	public List <Entrega> carregarEntregas(String entregador){
//		try {
//			return EntregasDAO.carregarEntregas(entregador);
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//			return new ArrayList <Entrega> ();
//		}
//	}
}
