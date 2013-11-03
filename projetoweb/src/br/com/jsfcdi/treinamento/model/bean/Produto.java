package br.com.jsfcdi.treinamento.model.bean;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Produto extends AbstractEntityBean {

	private String nome;
	private String descricao;
	private Double preco;
	private Double quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
}
