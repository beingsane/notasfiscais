package br.com.jsfcdi.treinamento.model.dao;

import javax.persistence.Query;

import br.com.jsfcdi.treinamento.model.bean.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario>{

	private static final long serialVersionUID = 1L;

	public UsuarioDAO() {
		super(Usuario.class);
	}
	
	public Usuario efetuarLogin(String login, String senha) {
		String jpql = "from Usuario u where u.login=:pLogin and u.senha=:pSenha";
		Query query = getEm().createQuery(jpql);
		query.setParameter("pLogin", login);
		query.setParameter("pSenha", senha);
		if (!query.getResultList().isEmpty()) {
			return (Usuario) query.getResultList().get(0);
		}
		return null;
	}
}