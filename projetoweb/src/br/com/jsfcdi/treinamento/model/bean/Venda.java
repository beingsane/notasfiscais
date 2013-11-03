package br.com.jsfcdi.treinamento.model.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.jsfcdi.treinamento.model.enums.StatusVendaEnum;

@SuppressWarnings("serial")
@Entity
public class Venda extends AbstractEntityBean {

	@Temporal(TemporalType.DATE)
	private Calendar data;

	@ManyToOne
	private Funcionario responsavel;

	@ManyToOne
	private Cliente cliente;

	@Enumerated(EnumType.STRING)
	private StatusVendaEnum status;

	@ManyToMany
	@JoinTable(name = "VendaObservador")
	private List<Funcionario> listaObservadores = new ArrayList<Funcionario>();

	@ManyToMany
	@JoinTable(name = "VendaTecnico")
	private List<Funcionario> listaTecnicos = new ArrayList<Funcionario>();

	@OneToMany(mappedBy = "venda")
	private List<VendaItem> listaItens = new ArrayList<VendaItem>();

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public StatusVendaEnum getStatus() {
		return status;
	}

	public void setStatus(StatusVendaEnum status) {
		this.status = status;
	}

	public List<Funcionario> getListaObservadores() {
		return listaObservadores;
	}

	public void setListaObservadores(List<Funcionario> listaObservadores) {
		this.listaObservadores = listaObservadores;
	}

	public List<Funcionario> getListaTecnicos() {
		return listaTecnicos;
	}

	public void setListaTecnicos(List<Funcionario> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}

	public List<VendaItem> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<VendaItem> listaItens) {
		this.listaItens = listaItens;
	}

}
