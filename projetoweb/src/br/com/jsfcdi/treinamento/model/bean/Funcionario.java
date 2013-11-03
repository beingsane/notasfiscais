package br.com.jsfcdi.treinamento.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends AbstractEntityBean {

	private String nome;

	@ManyToMany(mappedBy = "listaObservadores")
	private List<Venda> listaVendasObs = new ArrayList<Venda>();
	
	@ManyToMany(mappedBy = "listaTecnicos")
	private List<Venda> listaVendasTec = new ArrayList<Venda>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Venda> getListaVendasObs() {
		return listaVendasObs;
	}

	public void setListaVendasObs(List<Venda> listaVendasObs) {
		this.listaVendasObs = listaVendasObs;
	}

	public List<Venda> getListaVendasTec() {
		return listaVendasTec;
	}

	public void setListaVendasTec(List<Venda> listaVendasTec) {
		this.listaVendasTec = listaVendasTec;
	}

}
