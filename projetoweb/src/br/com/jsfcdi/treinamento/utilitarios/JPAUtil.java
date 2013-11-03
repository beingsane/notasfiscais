package br.com.jsfcdi.treinamento.utilitarios;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class JPAUtil {

	@Inject
	private transient static Logger logger;

	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("notas");

	@Produces
	@RequestScoped
	public static EntityManager getEntityManager() {
		EntityManager em = emf.createEntityManager();
		// em.getTransaction().begin();
		// logger.info("Iniciando transacao em.getTransaction():"+em.getTransaction());
		return em;
	}

	public static void close(@Disposes EntityManager em) {
		/*
		 * if(em.getTransaction().isActive()){ em.getTransaction().commit(); }
		 */
		if (em != null && logger != null) {
			logger.info("Encerrando a transacao em.getTransaction():"
					+ em.getTransaction());
		}

		em.close();
	}
}
