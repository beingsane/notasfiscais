package br.com.jsfcdi.treinamento.model.bean;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Cliente extends AbstractEntityBean{

	private String nome;
	private String email;

	public Cliente() {
	}
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
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

}
