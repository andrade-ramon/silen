package br.com.silen.interfaces;

import br.com.silen.model.Usuario;
import br.com.silen.to.UsuarioTO;

public interface IUsuario{
	
	public boolean inserir(Usuario usuario);
	
	public boolean alterar(Usuario usuario);
	
	public boolean excluir(Usuario usuario);
	
	public UsuarioTO consultar();
	
	public Usuario consultar(int cpf);

}
