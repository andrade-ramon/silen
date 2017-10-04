package br.com.silen.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.silen.dao.ClienteDAO;
import br.com.silen.model.Cliente;


public class ClienteService {
	private ClienteDAO ClienteDAO;
	
	public ClienteService (){
		ClienteDAO = new ClienteDAO();
	}
	
	public void criar (Cliente Cliente){
		try {
			ClienteDAO.criar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar (Cliente Cliente){
		try {
			ClienteDAO.atualizar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagar (Cliente Cliente){
		try {
			ClienteDAO.apagar(Cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List <Cliente> listarCompleto(){
		try {
			return ClienteDAO.listarCompleto();
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente> ();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List <Cliente> carregar(int idCliente, String nomeCliente){
		try {
			return (List<Cliente>) ClienteDAO.carregar(idCliente, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente> ();
		}
	}
	
	public Cliente buscarCliente(int idCliente, int CPFCNPJ, String nomeCliente){
		Cliente cliente = new Cliente();
		try {
			cliente = ClienteDAO.buscarCliente(idCliente, CPFCNPJ, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public List <Cliente> pesquisarCliente(int idCliente, String nomeCliente){
		try {
			return ClienteDAO.pesquisarCliente(idCliente, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente> ();
		}
	}
	
}
