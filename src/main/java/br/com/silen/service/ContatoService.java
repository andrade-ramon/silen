package br.com.silen.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.silen.dao.ContatoDAO;
import br.com.silen.model.Contato;

public class ContatoService {
	private ContatoDAO ContatoDAO;
	
	public ContatoService (){
		ContatoDAO = new ContatoDAO();
	}
	
	public void criar (Contato contato){
		try {
			ContatoDAO.criar(contato);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*public void atualizar (Cliente Cliente){
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
	*/
	
	public List <Contato> listarCompleto(){
		try {
			return ContatoDAO.listarCompleto();
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Contato> ();
		}
	}
	
	/*@SuppressWarnings("unchecked")
	public List <Cliente> carregar(int idCliente, String nomeCliente){
		try {
			return (List<Cliente>) ClienteDAO.carregar(idCliente, nomeCliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente> ();
		}
	}
	*/
}
