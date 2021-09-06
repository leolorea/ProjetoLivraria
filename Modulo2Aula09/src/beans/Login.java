package beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LENOVO LEGION
 *
 */
public class Login {
	private String senha;
	private String usuario;
	static private List<String> listaLogin = new ArrayList<String>();
	static private List<String> listaSenha = new ArrayList<String>();
	
	
	
	
	public Login (String usuario, String senha) {
		this.senha=senha;
		this.usuario = usuario;
		signin(usuario, senha);
	
	}
	
	public void signin (String usuario, String senha) {
		listaLogin.add(usuario);
		listaSenha.add(senha);
	}
	
	public static void cadastrado(String usuario, String senha) {
		try {if (listaLogin.contains(usuario) && listaSenha.contains(senha)) {
		System.out.println("Usuario logado com sucesso!");
			
			
	}else{	System.out.println("Senha invalida!");
		
		throw new Exception("Senha invalida" ); 
	
	
	}}catch(Exception ex){System.out.println("Não deu certo");}
	}

	
		
	public 	static void fazerLogin(String usuario, String senha) {
			
			cadastrado(usuario, senha);
		}

}

