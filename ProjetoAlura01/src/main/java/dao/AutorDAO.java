package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Autor;

public class AutorDAO {
	private Connection conexao;
	

	public AutorDAO(Connection conexao) {
		this.conexao = conexao;

	}

	public List<Autor> listar() {
		ArrayList<Autor> autores = new ArrayList<>();
		
		try {
		String sql = "  SELECT * FROM autor";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		
		while (rs.next()) {
			Autor autor = new Autor();
			
			autor.setNome(rs.getString("nome"));
			
			
			LocalDate dataFormatada= rs.getDate("dataNascimento").toLocalDate();
			DateTimeFormatter leo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String novaData = leo.format(dataFormatada);
			LocalDate newData = LocalDate.parse(novaData, leo);
		
			autor.setDataNascimento(newData);
			autor.setEmail(rs.getString("email"));
			autor.setSobreOAutor(rs.getString("sobre"));
			
			autores.add(autor);
		}

		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Deu errado!");
		}
		return autores;
	}

	public void cadastrar(Autor autor) {

		try {
			String sql = "INSERT INTO autor (nome, dataNascimento, email, sobre) VALUES (?,?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, autor.getNome());
			ps.setDate(2, Date.valueOf(autor.getDataNascimento()));
			ps.setString(3, autor.getEmail());
			ps.setString(4, autor.getSobreOAutor());
			ps.execute();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

}
