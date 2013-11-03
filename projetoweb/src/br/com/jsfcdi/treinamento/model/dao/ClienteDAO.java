package br.com.jsfcdi.treinamento.model.dao;

import br.com.jsfcdi.treinamento.model.bean.Cliente;

/**
 * @author marciopalheta
 *
 */
@SuppressWarnings("serial")
public class ClienteDAO extends GenericDAO<Cliente>{

	public ClienteDAO() {
		super(Cliente.class);
	}
	
}
