package br.com.silen.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.silen.factory.ConnectionFactory;
import br.com.silen.interfaces.IUsuario;
import br.com.silen.model.Usuario;
import br.com.silen.to.UsuarioTO;


public class UsuarioDAO implements IUsuario {

	@Override
	public boolean alterar(Usuario usuario){
		String sql = "UPDATE tb_usuario SET nomeUsuario = ? , CPF = ?, dataNascimento = ?, telResidencial = ?, telCelular = ?, telRecado = ?, enderecoUsuario = ?, complementoUsuario = ?, cepUsuario = ?, bairroUsuario = ?, cidadeUsuario = ?, estadoUsuario = ?, numeroUsuario = ? WHERE idUsuario = ?;";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ConnectionFactory.obterConexao();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getNomeUsuario());
			ps.setString(2, usuario.getCPF());
			ps.setString(3, usuario.getDataNascimento());
			ps.setString(4, usuario.getTelResidencial());
			ps.setString(5, usuario.getTelCelular());
			ps.setString(6, usuario.getTelRecado());
			ps.setString(7, usuario.getEnderecoUsuario());
			ps.setString(8, usuario.getComplementoUsuario());
			ps.setString(9, usuario.getCepUsuario());
			ps.setString(10, usuario.getBairroUsuario());
			ps.setString(11, usuario.getCidadeUsuario());
			ps.setString(12, usuario.getEstadoUsuario());
			ps.setInt(13, usuario.getNumeroUsuario());
			ps.setInt(14, usuario.getIdUsuario());
			ps.execute();
			
			return true;

		} catch (SQLException sqe) {
			System.out.println("teste23432");

			sqe.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

			if (conn != null) {
//				ConnectionFactory.desconectar(conn);
			}
		}

		return false;

	}

	@Override
	public boolean excluir(Usuario usuario) {
		String sql = "DELETE FROM tb_usuario WHERE idUsuario = ?";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ConnectionFactory.obterConexao();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, usuario.getIdUsuario());
			ps.execute();

			return true;

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

			if (conn != null) {
//				ConnectionFactory.desconectar(conn);
			}
		}

		return false;
	}

	@Override
	public boolean inserir(Usuario usuario) {

		String sql = "INSERT INTO TB_USUARIO (nomeUsuario,CPF,dataNascimento,telResidencial,telCelular,telRecado,enderecoUsuario,complementoUsuario,cepUsuario,bairroUsuario,cidadeUsuario,estadoUsuario,numeroUsuario)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement ps = null;

		try {

			conn = ConnectionFactory.obterConexao();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getNomeUsuario());
			ps.setString(2, usuario.getCPF());
			ps.setString(3, usuario.getDataNascimento());
			ps.setString(4, usuario.getTelResidencial());
			ps.setString(5, usuario.getTelCelular());
			ps.setString(6, usuario.getTelRecado());
			ps.setString(7, usuario.getEnderecoUsuario());
			ps.setString(8, usuario.getComplementoUsuario());
			ps.setString(9, usuario.getCepUsuario());
			ps.setString(10, usuario.getBairroUsuario());
			ps.setString(11, usuario.getCidadeUsuario());
			ps.setString(12, usuario.getEstadoUsuario());
			ps.setInt(13, usuario.getNumeroUsuario());
			ps.execute();

			return true;

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

			if (conn != null) {
//				ConnectionFactory.desconectar(conn);
			}
		}

		return false;
	}

	@Override
	public UsuarioTO consultar() {
		String sql = "SELECT idUsuario,nomeUsuario,CPF,dataNascimento,telResidencial,telCelular,"
				+ " telRecado,enderecoUsuario,complementoUsuario,cepUsuario,bairroUsuario,cidadeUsuario,estadoUsuario,numeroUsuario "
				+ "FROM tb_usuario;";

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UsuarioTO usuTO = new UsuarioTO();

		try {
			conn = ConnectionFactory.obterConexao();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt(1));
				usuario.setNomeUsuario(rs.getString(2));
				usuario.setCPF(rs.getString(3));
				usuario.setDataNascimento(rs.getString(4));
				usuario.setTelResidencial(rs.getString(5));
				usuario.setTelCelular(rs.getString(6));
				usuario.setTelRecado(rs.getString(7));
				usuario.setEnderecoUsuario(rs.getString(8));
				usuario.setComplementoUsuario(rs.getString(9));
				usuario.setCepUsuario(rs.getString(10));
				usuario.setBairroUsuario(rs.getString(11));
				usuario.setCidadeUsuario(rs.getString(12));
				usuario.setEstadoUsuario(rs.getString(13));
				usuario.setNumeroUsuario(rs.getInt(14));
				usuTO.add(usuario);
			}

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

			if (conn != null) {
//				ConnectionFactory.desconectar(conn);
			}
		}

		return usuTO;
	}

	@Override
	public Usuario consultar(int cpf) {
		String sql = "SELECT idUsuario,nomeUsuario,CPF,dataNascimento,telResidencial,telCelular,"
				+ " telRecado,enderecoUsuario,complementoUsuario,cepUsuario,bairroUsuario,cidadeUsuario,estadoUsuario,numeroUsuario "
				+ "FROM tb_usuario WHERE CPF = ?;";

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = new Usuario();


		try {
			conn = ConnectionFactory.obterConexao();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cpf);
			rs = ps.executeQuery();

			while (rs.next()) {
				usuario.setIdUsuario(rs.getInt(1));
				usuario.setNomeUsuario(rs.getString(2));
				usuario.setCPF(rs.getString(3));
				usuario.setDataNascimento(rs.getString(4));
				usuario.setTelResidencial(rs.getString(5));
				usuario.setTelCelular(rs.getString(6));
				usuario.setTelRecado(rs.getString(7));
				usuario.setEnderecoUsuario(rs.getString(8));
				usuario.setComplementoUsuario(rs.getString(9));
				usuario.setCepUsuario(rs.getString(10));
				usuario.setBairroUsuario(rs.getString(11));
				usuario.setCidadeUsuario(rs.getString(12));
				usuario.setEstadoUsuario(rs.getString(13));
				usuario.setNumeroUsuario(rs.getInt(14));
			}

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

			if (conn != null) {
//				ConnectionFactory.desconectar(conn);
			}
		}

		return usuario;
	}

}
