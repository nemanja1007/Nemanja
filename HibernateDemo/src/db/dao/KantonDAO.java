package db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db.model.Kanton;

public class KantonDAO {
	private EntityManagerFactory entityManagerFactory;
	
	public KantonDAO()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory( "person.jpa" );
	}
	
	//Kanton wird in DB gespeichert
	public void insertKanton(Kanton k)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(k);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	//Alle Daten lesen
	public List<Kanton> selectAllKanton()
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Kanton> result = entityManager.createQuery( "from Kanton", Kanton.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
	}
	
	// Bearbeitet / Updatet Name des Kantons
		public void updateKanton(Kanton k) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			k = entityManager.merge(k);
			entityManager.persist(k);
			entityManager.getTransaction().commit();
			entityManager.close();
		}

		// Löscht Kanton
		public void deleteKanton(String kuerzel) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			Kanton k = new Kanton();
			k.setKuerzel(kuerzel);
			k = entityManager.merge(k);
			entityManager.remove(k);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
}

