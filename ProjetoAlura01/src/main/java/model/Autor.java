package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {
	
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String sobreOAutor;
	
	
	public Autor(String nome, String email, LocalDate dataNascimento, String sobreOAutor) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sobreOAutor = sobreOAutor;
	}


	public Autor() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public String getSobreOAutor() {
		return sobreOAutor;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		
		this.dataNascimento = dataNascimento;
	}


	public void setSobreOAutor(String sobreOAutor) {
		this.sobreOAutor = sobreOAutor;
	}



}
