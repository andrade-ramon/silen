package to;

import java.io.Serializable;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> lista;
	
	public UsuarioTO(){
		lista = new ArrayList<Usuario>();
	}
	
	public void add(Usuario usuario){
		lista.add(usuario);
	}
	
	public boolean remove(Usuario usuario){
		return(lista.remove(usuario));
	}
	
	public ArrayList<Usuario> getLista(){
		return lista;
	}
}
