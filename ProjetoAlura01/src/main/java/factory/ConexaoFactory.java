package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private Connection conexao;
	
	public Connection getConexao() {
		
		String url = "jdbc:mysql://localhost:3306/livraria?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String senha = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		 conexao = DriverManager.getConnection(url,user,senha);
		
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.getMessage();
			System.out.println("Deu errado no factory");
		}
		return conexao;
		
	
		
	}

}
