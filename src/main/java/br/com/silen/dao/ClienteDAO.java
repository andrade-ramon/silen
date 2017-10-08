package br.com.silen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.silen.factory.ConnectionFactory;
import br.com.silen.model.Cliente2;


public class ClienteDAO {

	public void criar (Cliente2 cliente) throws SQLException {
		String sqlInsert = "INSERT INTO tb_cliente (nomeCliente, CPFCNPJ, telCelular, telFixo, telRecado, email, enderecoCliente, numeroCliente, complementoCliente, bairroCliente, cidadeCliente, estadoCliente, cepCliente,idTipoContrato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn  = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlInsert)){
				ps.setString(1, cliente.getNomeCliente());
				ps.setString(2, cliente.getCPFCNPJ());
				
				ps.setString(3, cliente.getTelCelular());
				ps.setString(4, cliente.getTelFixo());
				ps.setString(5, cliente.getTelRecado());
				ps.setString(6, cliente.getEmail());
				ps.setString(7, cliente.getEnderecoCliente());
				ps.setString(8, cliente.getNumeroCliente());
				ps.setString(9, cliente.getComplementoCliente());
				ps.setString(10, cliente.getBairroCliente());
				ps.setString(11, cliente.getCidadeCliente());
				ps.setString(12, cliente.getEstadoCliente());
				ps.setString(13, cliente.getCepCliente());
//				ps.setInt(14, cliente.getTipoPessoa());
				ps.setInt(15, cliente.getIdTipoContrato());
				
				ps.execute();	
				String sqlSelect = "SELECT LAST_INSERT_ID() AS idCliente";
				try (PreparedStatement ps2 = conn.prepareStatement(sqlSelect);
						ResultSet rs = ps2.executeQuery();){
						if (rs.next()){
							cliente.setIdCliente(rs.getInt("idCliente"));
						}
				}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagar (Cliente2 cliente)throws SQLException {
		String sqlDelete = "DELETE FROM tb_cliente WHERE idCliente = ?";
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlDelete);){
				ps.setInt(1, cliente.getIdCliente());
				ps.execute();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
 
	public Cliente2 carregar(int idCliente, String nomeCliente) throws SQLException  {
		String sqlSelect = "SELECT * FROM tb_cliente WHERE id = ? or nomeCliente = ?";
		Cliente2 cliente = new Cliente2();
		try(Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlSelect)){
			ps.setInt(1, idCliente);
			ps.setString(2, nomeCliente);
			try (ResultSet rs = ps.executeQuery();){
				if (rs.next()){					
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setCPFCNPJ(rs.getString("CPFCNPJ"));
					cliente.setTelCelular(rs.getString("telCelular"));
					cliente.setTelFixo(rs.getString("telFixo"));
					cliente.setTelRecado(rs.getString("telRecado"));
					cliente.setEmail(rs.getString("email"));
					cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
					cliente.setNumeroCliente(rs.getString("numeroCliente"));
					cliente.setComplementoCliente(rs.getString("complementoCliente"));
					cliente.setBairroCliente(rs.getString("bairroCliente"));
					cliente.setCidadeCliente(rs.getString("cidadeCliente"));
					cliente.setEstadoCliente(rs.getString("estadoCliente"));
					cliente.setCepCliente(rs.getString("cepCliente"));
				}
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return cliente;
	}
	
	public void atualizar(Cliente2 cliente) throws SQLException  {
		String sqlUpdate = "UPDATE tb_cliente SET nomeCliente= ?, CPFCNPJ=?, telCelular = ?, telFixo = ?, telRecado = ?, email=?, enderecoCliente = ?, numeroCliente = ?, complementoCliente = ?, bairroCliente = ?, cidadeCliente = ?, estadoCliente = ?, cepCliente = ? where idCliente = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlUpdate)){

				ps.setString(1, cliente.getNomeCliente());
				ps.setString(2, cliente.getCPFCNPJ());
				ps.setString(3, cliente.getTelCelular());
				ps.setString(4, cliente.getTelFixo());
				ps.setString(5, cliente.getTelRecado());
				ps.setString(6, cliente.getEmail());
				ps.setString(7, cliente.getEnderecoCliente());
				ps.setString(8, cliente.getNumeroCliente());
				ps.setString(9, cliente.getComplementoCliente());
				ps.setString(10, cliente.getBairroCliente());
				ps.setString(11, cliente.getCidadeCliente());
				ps.setString(12, cliente.getEstadoCliente());
				ps.setString(13, cliente.getCepCliente());
				ps.setInt(14, cliente.getIdCliente());
				
				ps.execute();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public List<Cliente2> listarCompleto() throws SQLException {
		List <Cliente2> clientes = new ArrayList <> ();
		String sqlSelect = "SELECT * FROM tb_cliente";
		try (Connection conn = ConnectionFactory.obterConexao();PreparedStatement ps = conn.prepareStatement(sqlSelect);
				ResultSet rs = ps.executeQuery();){
				while (rs.next()){
					Cliente2 cliente = new Cliente2 ();
					cliente.setIdCliente(rs.getInt("idCliente"));
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setCPFCNPJ(rs.getString("CPFCNPJ"));
					cliente.setEmail(rs.getString("email"));
					cliente.setCidadeCliente(rs.getString("cidadeCliente"));
					cliente.setEstadoCliente(rs.getString("estadoCliente"));
					cliente.setIdTipoContrato(rs.getInt("idTipoContrato"));
					clientes.add(cliente);
				}
		}
		return clientes;
	}
	
	public Cliente2 buscarCliente(int idCliente, int CPFCNPJ, String nomeCliente) throws SQLException  {
		String sqlSelect = "SELECT * FROM tb_cliente WHERE ";
		Cliente2 cliente = new Cliente2();
		try(Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlSelect)){
			ps.setInt(1, idCliente);
			try (ResultSet rs = ps.executeQuery();){
				if (rs.next()){					
					cliente.setIdCliente(rs.getInt("idCliente"));
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setCPFCNPJ(rs.getString("CPFCNPJ"));
					cliente.setTelCelular(rs.getString("telCelular"));
					cliente.setTelFixo(rs.getString("telFixo"));
					cliente.setTelRecado(rs.getString("telRecado"));
					cliente.setEmail(rs.getString("email"));
					cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
					cliente.setNumeroCliente(rs.getString("numeroCliente"));
					cliente.setComplementoCliente(rs.getString("complementoCliente"));
					cliente.setBairroCliente(rs.getString("bairroCliente"));
					cliente.setCidadeCliente(rs.getString("cidadeCliente"));
					cliente.setEstadoCliente(rs.getString("estadoCliente"));
					cliente.setCepCliente(rs.getString("cepCliente"));
				}
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println(cliente.toString());
		return cliente;
	}
	
	public List<Cliente2> pesquisarCliente(int idCliente, String nomeCliente) throws SQLException  {
		List <Cliente2> clientes = new ArrayList <> ();
		String sqlSelect;

		if(idCliente != 0 && nomeCliente != ""){
			sqlSelect = "SELECT * FROM tb_cliente WHERE idCliente = " + idCliente + " and nomeCliente ='" + nomeCliente + "'";
		}
		else{
			if(idCliente != 0){
				sqlSelect = "SELECT * FROM tb_cliente WHERE idCliente = " + idCliente;
			}
			else{
				if(nomeCliente != ""){
					sqlSelect = "SELECT * FROM tb_cliente WHERE nomeCliente like '%" + nomeCliente + "%'";
				}
				else{
					sqlSelect = "SELECT * FROM tb_cliente";
				}
			}
		}
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlSelect);){
				
				try (ResultSet rs = ps.executeQuery();){				
						while (rs.next()){	
						Cliente2 cliente = new Cliente2();
						cliente.setIdCliente(rs.getInt("idCliente"));
						cliente.setNomeCliente(rs.getString("nomeCliente"));
						cliente.setCPFCNPJ(rs.getString("CPFCNPJ"));
						cliente.setTipoPessoa(rs.getInt("tipoPessoa"));
						cliente.setTelCelular(rs.getString("telCelular"));
						cliente.setTelFixo(rs.getString("telFixo"));
						cliente.setTelRecado(rs.getString("telRecado"));
						cliente.setEmail(rs.getString("email"));
						cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
						cliente.setNumeroCliente(rs.getString("numeroCliente"));
						cliente.setComplementoCliente(rs.getString("complementoCliente"));
						cliente.setBairroCliente(rs.getString("bairroCliente"));
						cliente.setCidadeCliente(rs.getString("cidadeCliente"));
						cliente.setEstadoCliente(rs.getString("estadoCliente"));
						cliente.setCepCliente(rs.getString("cepCliente"));
						cliente.setIdTipoContrato(rs.getInt("idTipoContrato"));
						clientes.add(cliente);
					}
				}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return clientes;
	}
	
}
