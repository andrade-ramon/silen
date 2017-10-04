package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contato;
import factory.ConnectionFactory;

public class ContatoDAO {

	public void criar (Contato Contato)throws SQLException {
		String sqlInsert = "INSERT INTO tb_contato (nomeContato, emailContato, comentario) VALUES ( ?, ?, ?)";
		try (Connection conn  = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlInsert)){
				ps.setString(1, Contato.getNomeContato());
				ps.setString(2, Contato.getEmailContato());
				ps.setString(3, Contato.getComentario());			
				
				ps.execute();	
				String sqlSelect = "SELECT LAST_INSERT_ID() AS idCliente";
				try (PreparedStatement ps2 = conn.prepareStatement(sqlSelect);
						ResultSet rs = ps2.executeQuery();){
						if (rs.next()){
							Contato.setNomeContato(rs.getString("nomeContato"));
						}
				}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	/*public void apagar (Cliente cliente)throws SQLException {
		String sqlDelete = "DELETE FROM tb_cliente WHERE idCliente = ?";
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlDelete);){
				ps.setInt(1, cliente.getIdCliente());
				ps.execute();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}*/
 
	public Contato carregar(String nomeContato, String emailContato) throws SQLException  {
		String sqlSelect = "SELECT * FROM tb_contato WHERE nome = ? or email = ?";
		Contato Contato = new Contato();
		try(Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlSelect)){
			ps.setString(1, nomeContato);
			ps.setString(2, emailContato);
			try (ResultSet rs = ps.executeQuery();){
				if (rs.next()){					
					Contato.setNomeContato(rs.getString("nomeContato"));
					Contato.setEmailContato(rs.getString("nomeEmail"));
					Contato.setComentario(rs.getString("comentario"));
				}
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return Contato;
	}
	
	/*public void atualizar(Cliente cliente) throws SQLException  {
		String sqlUpdate = "UPDATE tb_cliente SET nomeCliente= ?, CPFCNPJ=?, telCelular = ?, telFixo = ?, telRecado = ?, email=?, enderecoCliente = ?, numeroCliente = ?, complementoCliente = ?, bairroCliente = ?, cidadeCliente = ?, estadoCliente = ?, cepCliente = ? where idCliente = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlUpdate)){

				ps.setString(1, cliente.getNomeCliente());
				ps.setInt(2, cliente.getCPFCNPJ());
				ps.setString(3, cliente.getTelCelular());
				ps.setString(4, cliente.getTelFixo());
				ps.setString(5, cliente.getTelRecado());
				ps.setString(6, cliente.getEmail());
				ps.setString(7, cliente.getEnderecoCliente());
				ps.setInt(8, cliente.getNumeroCliente());
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
	}*/	
	
	public List<Contato> listarCompleto() throws SQLException {
		List <Contato> Contatos = new ArrayList <> ();
		String sqlSelect = "SELECT * FROM tb_contato";
		try (Connection conn = ConnectionFactory.obterConexao();PreparedStatement ps = conn.prepareStatement(sqlSelect);
				ResultSet rs = ps.executeQuery();){
				while (rs.next()){
					Contato contato = new Contato();
					contato.setNomeContato(rs.getString("nomeContato"));
					contato.setEmailContato(rs.getString("emailContato"));
					contato.setComentario(rs.getString("comentario"));
					Contatos.add(contato);
				}
		}
		return Contatos;
	}
	
	/*
	public List<Cliente> carregar(String titulo) throws SQLException  {
		List <Cliente> clientes = new ArrayList <> ();
		String sqlSelect = "SELECT * FROM cliente where titulo like ?";
		try(Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sqlSelect);){

			ps.setString(1, '%'+titulo+'%');
				
			try (ResultSet rs = ps.executeQuery();){
				
			while (rs.next()){
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setTitulo(rs.getString("titulo"));
				cliente.setAutor(rs.getString("autor"));
				cliente.setAno(rs.getInt("ano"));
				cliente.setEdicao(rs.getInt("edicao"));
				cliente.setISBN(rs.getString("isbn"));
				clientes.add(cliente);
			}
		}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return clientes;
	}*/
}
