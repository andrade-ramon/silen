package br.com.silen.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.silen.dao.ClienteDAO;
import br.com.silen.model.Cliente2;


public class ClienteService {
	private ClienteDAO ClienteDAO;
	
	public ClienteService (){
		ClienteDAO = new ClienteDAO();
	}
	
	public void criar (Cliente2 Cliente){
		try {
			ClienteDAO.criar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar (Cliente2 Cliente){
		try {
			ClienteDAO.atualizar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagar (Cliente2 Cliente){
		try {
			ClienteDAO.apagar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List <Cliente2> listarCompleto(){
		try {
			return ClienteDAO.listarCompleto();
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente2> ();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List <Cliente2> carregar(int idCliente, String nomeCliente){
		try {
			return (List<Cliente2>) ClienteDAO.carregar(idCliente, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente2> ();
		}
	}
	
	public Cliente2 buscarCliente(int idCliente, int CPFCNPJ, String nomeCliente){
		Cliente2 cliente = new Cliente2();
		try {
			cliente = ClienteDAO.buscarCliente(idCliente, CPFCNPJ, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public List <Cliente2> pesquisarCliente(int idCliente, String nomeCliente){
		try {
			return ClienteDAO.pesquisarCliente(idCliente, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente2> ();
		}
	}
	
}
