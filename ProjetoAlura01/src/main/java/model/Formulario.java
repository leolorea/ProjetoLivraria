package model;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.MaskFormatter;

import dao.AutorDAO;
import factory.ConexaoFactory;

@WebServlet("/formulario")
public class Formulario extends HttpServlet {
	ConexaoFactory conect = new ConexaoFactory();
	AutorDAO dao = new AutorDAO(conect.getConexao());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("autores", dao.listar());
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			LocalDate data = LocalDate.parse(request.getParameter("data"));
			String sobre = request.getParameter("sobre");

			Autor autor = new Autor(nome, email, data, sobre);

			dao.cadastrar(autor);

			response.sendRedirect("formulario");

		} catch (Exception e) {

			System.out.println(e.getMessage());

			response.sendRedirect("validacao.html");
		}

	}

}
