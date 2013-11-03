package br.com.jsfcdi.treinamento.util;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import br.com.jsfcdi.treinamento.model.enums.ChaveMensagemEnum;

public abstract class Util {

	public static void setMessageView(FacesContext context,
			ChaveMensagemEnum titulo, ChaveMensagemEnum mensagem,
			Severity severity) {

		String valorTitulo = "", valorMensagem = "";
		if (titulo != null) {
			valorTitulo = getMessageBundle(context, titulo.getChave());
		}

		if (mensagem != null) {
			valorMensagem = getMessageBundle(context, mensagem.getChave());
		}

		FacesMessage msg = new FacesMessage(severity, valorTitulo,
				valorMensagem);
		context.addMessage(null, msg);
	}

	public static void setMessageView(FacesContext context,
			ChaveMensagemEnum titulo, ChaveMensagemEnum mensagem) {

		setMessageView(context, titulo, mensagem, FacesMessage.SEVERITY_INFO);
	}

	protected String getMessage(String key) {
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		Locale locale = viewRoot.getLocale();
		ResourceBundle bundle = ResourceBundle.getBundle(
				"br.com.jsfcdi.treinamento.messages.Mensagens", locale);
		return bundle.getString(key);
	}

	public static String getMessageBundle(FacesContext facesContext,
			String chave) {
		ResourceBundle bundle = facesContext.getApplication()
				.getResourceBundle(facesContext, "msg");
		return bundle.getString(chave);

	}

}
