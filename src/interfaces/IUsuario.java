package interfaces;

import to.UsuarioTO;
import model.Usuario;

public interface IUsuario{
	
	public boolean inserir(Usuario usuario);
	
	public boolean alterar(Usuario usuario);
	
	public boolean excluir(Usuario usuario);
	
	public UsuarioTO consultar();
	
	public Usuario consultar(int cpf);

}
