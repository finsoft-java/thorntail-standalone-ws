package it.finsoft.Thorntail.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.finsoft.Thorntail.entity.Estrattore;

@Stateless
public class EstrattoriManager {

	@PersistenceContext(name = "pu")
	EntityManager em;

	public List<Estrattore> findAll() {

		return em.createNamedQuery("estrattori.selectAll", Estrattore.class).getResultList();
	}

	public Estrattore findOne(int x) {
		return em.find(Estrattore.class, x);
	}

	public void stopProcedure() {
		Query query = em.createNamedQuery("estrattori.abort")
				.setParameter("initial", "INITIAL");
		query.executeUpdate();
	}

	public void runProcedure(List<Integer> lista) {

		Query query = em.createNamedQuery("estrattori.runProcedure").setParameter("lista", lista);
		query.executeUpdate();


	}
}
