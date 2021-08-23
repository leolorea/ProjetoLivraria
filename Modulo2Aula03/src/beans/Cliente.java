package beans;

public class Cliente {
	
	private String nome;
	private String endereço;
	private String cpf;
	private String rg;
	
	
	public Cliente(String nome, String endereço, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereço = endereço;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	
}


