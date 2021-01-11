package br.com.cursojava;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String login;
	private String email;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario() {
	}

	public Usuario(String nome, String login, String email, String senha) {
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", email=" + email + ", senha=" + senha + "]";
	}

}
