package br.com.silen.entregas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.silen.factory.ConnectionFactory;

public class EntregasDAO {

	public List<Entrega> listarEntregasDe(int idEntregador) {
		List<Entrega> entregas = new ArrayList<>();

		String sqlSelect = "SELECT * FROM tb_entrega where idEntregador = ?";
		try {
			Connection conn = ConnectionFactory.obterConexao();
			PreparedStatement ps = conn.prepareStatement(sqlSelect);
			ps.setInt(1, idEntregador);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Entrega entrega = new Entrega();
				entrega.setIdEntrega(rs.getInt("idEntrega"));
				entrega.setIdRemetente(rs.getInt("idRemetente"));
				entrega.setContato(rs.getString("contato"));
				entrega.setTelefone(rs.getString("telefone"));
				entregas.add(entrega);
			}

			return entregas;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao carregar entregas do entregador " + idEntregador);
		}
	}

	public List<Entrega> listarTodasEntregas() {
		List<Entrega> entregas = new ArrayList<>();

		String sqlSelect = "SELECT * FROM tb_entrega";
		try {
			Connection conn = ConnectionFactory.obterConexao();
			PreparedStatement ps = conn.prepareStatement(sqlSelect);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Entrega entrega = new Entrega();
				entrega.setIdEntrega(rs.getInt("idEntrega"));
				entrega.setIdRemetente(rs.getInt("idRemetente"));
				entrega.setContato(rs.getString("contato"));
				entrega.setTelefone(rs.getString("telefone"));
				entregas.add(entrega);
			}

			return entregas;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao carregar entregas");
		}
	}

	public Entrega findById(int idEntrega) {
		String sqlSelect = "SELECT * FROM tb_entrega where idEntrega = ?";
		try {
			Connection conn = ConnectionFactory.obterConexao();
			PreparedStatement ps = conn.prepareStatement(sqlSelect);
			ps.setInt(1, idEntrega);
			ResultSet rs = ps.executeQuery();
			//TODO
			rs.next();
				Entrega entrega = new Entrega();
				entrega.setIdEntrega(rs.getInt("idEntrega"));
				entrega.setIdRemetente(rs.getInt("idRemetente"));
				entrega.setContato(rs.getString("contato"));
				entrega.setTelefone(rs.getString("telefone"));
			return entrega;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao carregar entrega " + idEntrega);
		}
	}

	// public void criarEntrega (Entrega entrega)throws SQLException {
	// String sqlInsertRemetente = "INSERT INTO tb_remetente
	// (nomeRemetente,enderecoRemetente,numeroRemetente,complementoRemetente,bairroRemetente,cidadeRemetente,estadoRemetente
	// ) VALUES (?, ?, ?, ?, ?, ?, ?)";
	// try (Connection conn = ConnectionFactory.obterConexao();
	// PreparedStatement ps = conn.prepareStatement(sqlInsertRemetente)){
	// ps.setString(1, entrega.getRemetente().getNomeCliente());
	// ps.setString(2, entrega.getRemetente().getEnderecoCliente());
	// ps.setString(3, entrega.getRemetente().getNumeroCliente());
	// ps.setString(4, entrega.getRemetente().getComplementoCliente());
	// ps.setString(5, entrega.getRemetente().getBairroCliente());
	// ps.setString(6, entrega.getRemetente().getCidadeCliente());
	// ps.setString(7, entrega.getRemetente().getEstadoCliente());
	//
	//
	// String sqlSelectRemetente = "select idRemetente from tb_remetente order
	// by idRemetente desc limit 1;";
	// try (PreparedStatement ps2 = conn.prepareStatement(sqlSelectRemetente);
	// ResultSet rs = ps2.executeQuery();){
	// if (rs.next()){
	// entrega.setIdRemetente(rs.getInt("idRemetente"));
	// }
	// }
	//
	// }
	// catch (SQLException e) {
	// e.printStackTrace();
	// }
	//
	// String sqlInsertDestinatario = "INSERT INTO tb_destinatario
	// (nomeDestinatario,enderecoDestinatario,numeroDestinatario,complementoDestinatario,bairroDestinatario,cidadeDestinatario,estadoDestinatario
	// ) VALUES (?, ?, ?, ?, ?, ?, ?)";
	// try (Connection conn = ConnectionFactory.obterConexao();
	// PreparedStatement ps = conn.prepareStatement(sqlInsertDestinatario)){
	// ps.setString(1, entrega.getDestinatario().getNomeCliente());
	// ps.setString(2, entrega.getDestinatario().getEnderecoCliente());
	// ps.setString(3, entrega.getDestinatario().getNumeroCliente());
	// ps.setString(4, entrega.getDestinatario().getComplementoCliente());
	// ps.setString(5, entrega.getDestinatario().getBairroCliente());
	// ps.setString(6, entrega.getDestinatario().getCidadeCliente());
	// ps.setString(7, entrega.getDestinatario().getEstadoCliente());
	// ps.execute();
	//
	// String sqlSelectDestinatario = "select idDestinatario from
	// tb_destinatario order by idDestinatario desc limit 1;";
	// try (PreparedStatement ps2 =
	// conn.prepareStatement(sqlSelectDestinatario);
	// ResultSet rs = ps2.executeQuery();){
	// if (rs.next()){
	// entrega.setIdDestinatario(rs.getInt("idDestinatario"));
	// }
	// }
	// }
	// catch (SQLException e) {
	// e.printStackTrace();
	// }
	//
	// String sqlInsertEntrega = "INSERT INTO tb_entrega (idRemetente,
	// idDestinatario,quantidade, peso, entregador, contato, telefone, idStatus,
	// idTipo, dataEnvio, dataRetirada) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	// try (Connection conn = ConnectionFactory.obterConexao();
	// PreparedStatement ps = conn.prepareStatement(sqlInsertEntrega)){
	// ps.setInt(1, entrega.getIdRemetente());
	// ps.setInt(2, entrega.getIdDestinatario());
	// ps.setInt(3, entrega.getQuantidade());
	// ps.setDouble(4, entrega.getPeso());
	// ps.setString(5, entrega.getEntregador());
	// ps.setString(6, entrega.getContato());
	// ps.setString(7, entrega.getTelefone());
	// ps.setInt(8, entrega.getIdStatus());
	// ps.setInt(9, entrega.getIdTipoEntrega());
	// ps.setString(10, entrega.getDataEnvio());
	// ps.setString(11, entrega.getDataEnvio());
	// ps.execute();
	//
	// String sqlSelectEntrega = "SELECT LAST_INSERT_ID() AS idEntrega";
	// try (PreparedStatement ps2 = conn.prepareStatement(sqlSelectEntrega);
	// ResultSet rs = ps2.executeQuery();){
	// if (rs.next()){
	// entrega.setIdEntrega(rs.getInt("idEntrega"));
	// }
	// }
	// }
	// catch (SQLException e) {
	// e.printStackTrace();
	// }
	//
	//
	//
	// }
	//
	//
	// public void apagarEntrega (Entrega Entregas)throws SQLException {
	// String sqlDelete = "DELETE FROM tb_entrega WHERE idEntrega = ?";
	// try (Connection conn = ConnectionFactory.obterConexao();
	// PreparedStatement ps = conn.prepareStatement(sqlDelete);){
	// ps.setInt(1, Entregas.getIdEntrega());
	// ps.execute();
	// }
	// catch (SQLException e){
	// e.printStackTrace();
	// }
	// }
	//
	//
	// public void atualizarEntrega (Entrega Entregas) throws SQLException {
	// String sqlUpdate = "UPDATE Entregas SET titulo=?, autor=?, ano=?,
	// edicao=?, isbn=? WHERE id=?";
	// // usando o try with resources do Java 7, que fecha o que abriu
	// try (Connection conn = ConnectionFactory.obterConexao();
	// PreparedStatement ps = conn.prepareStatement(sqlUpdate)){
	// /*ps.setString(1, Entregas.getTitulo());
	// ps.setString(2, Entregas.getAutor());
	// ps.setInt(3, Entregas.getAno());
	// ps.setInt(4, Entregas.getEdicao());
	// ps.setString(5, Entregas.getISBN());
	// ps.setInt(6, Entregas.getId());*/
	// ps.execute();
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	//
	// public List<Entrega> listarCompleto() throws SQLException {
	// List <Entrega> Entregas = new ArrayList <> ();
	// String sqlSelect = "SELECT * FROM tb_entrega";
	// try (Connection conn = ConnectionFactory.obterConexao();PreparedStatement
	// ps = conn.prepareStatement(sqlSelect);
	// ResultSet rs = ps.executeQuery();){
	// while (rs.next()){
	// Entrega Entrega = new Entrega ();
	// Entrega.setIdEntrega(rs.getInt("idEntrega"));
	// Entrega.setQuantidade(rs.getInt("quantidade"));
	// Entrega.setPeso(rs.getInt("peso"));
	//// Entrega.setEntregador(rs.getString("entregador"));
	// Entrega.setContato(rs.getString("contato"));
	// Entrega.setTelefone(rs.getString("telefone"));
	// Entrega.setIdStatus(rs.getInt("idStatus"));
	// Entrega.setIdTipoEntrega(rs.getInt("idTipo"));
	// Entrega.setDataEnvio(rs.getString("dataEnvio"));
	// Entrega.setDataRetirada(rs.getString("dataRetirada"));
	// Entregas.add(Entrega);
	// }
	// }
	// return Entregas;
	// }
	//
	//
	//

}
