package br.com.jsfcdi.treinamento.mb;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@SessionScoped
@Named
public class UsuarioSessionMB implements Serializable{

	@Inject
	private Conversation conversa;
	
	public String exibirHome() {
		if (!conversa.isTransient()) {
			conversa.end();
		}
		return "index?faces-redirect=true";
	}
}
