package br.com.jsfcdi.treinamento.mb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ConversationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import br.com.jsfcdi.treinamento.model.bean.Cliente;
import br.com.jsfcdi.treinamento.model.dao.ClienteDAO;

@SuppressWarnings("serial")
@ConversationScoped
@Named
public class ClienteMB extends GenericMB<Cliente, ClienteDAO> {

	@Override
	@PostConstruct
	public void carregarLista() {
		setPaginaDados("clientedados");
		setPaginaListagem("cliente");
		carregarListaPaginada();
	}

	public String onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Id Selected",
				((Cliente) event.getObject()).getId().toString());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return getPaginaDados();
	}

	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Id Unselected",
				((Cliente) event.getObject()).getId().toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
