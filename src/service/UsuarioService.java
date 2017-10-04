package service;

import dao.UsuarioDAO;
import model.Usuario;
import to.UsuarioTO;

public class UsuarioService{
	private UsuarioDAO usuarioDAO;

	public UsuarioService() {
		usuarioDAO = new UsuarioDAO();
	}

	public boolean inserir(Usuario usuario) {
		return usuarioDAO.inserir(usuario);
	}

	public boolean alterar(Usuario usuario) {
		return usuarioDAO.alterar(usuario);
	}

	public boolean excluir(Usuario usuario) {
		return usuarioDAO.excluir(usuario);
	}

	public Usuario consultar(int cpf) {
		return usuarioDAO.consultar(cpf);
	}

	public UsuarioTO consultar() {
		return usuarioDAO.consultar();
	}
}