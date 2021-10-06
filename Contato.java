package br.fiap.entidade;

public class Contato {
	private String nome;
	private String email;
	private String fone;
	
	public Contato(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}	
}
