package db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db.model.Person;

public class PersonDAO {
	private EntityManagerFactory entityManagerFactory;
	
	public PersonDAO()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory( "person.jpa" );
	}
	
	//Person wird in DB gespeichert
	public void insert(Person p)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	//Alle Daten lesen
	public List<Person> selectAll()
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Person> result = entityManager.createQuery( "from Person", Person.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
	}
	
	// Bearbeitet / Updatet Name der Person
		public void update(Person p) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			p = entityManager.merge(p);
			entityManager.persist(p);
			entityManager.getTransaction().commit();
			entityManager.close();
		}

		// Löscht Person mit angegebener ID
		public void delete(int id) {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			Person p = new Person();
			p.setId(id);
			p = entityManager.merge(p);
			entityManager.remove(p);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
}
