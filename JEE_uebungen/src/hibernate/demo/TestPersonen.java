package hibernate.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestPersonen {
	private EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		TestPersonen tp = new TestPersonen();
		tp.open();
		//tp.testInsert();
		tp.testSelectById();
		tp.testDelete();
		tp.testUpdate();
		tp.selectAll();
		tp.close();

	}

	public void open() {
		entityManagerFactory = Persistence.createEntityManagerFactory("personen.jpa");

	}

	public void testInsert() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Person p = new Person();
		p.setId(4);
		p.setName("Demba");
		p.setVorname("Djibril");
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void testSelectById() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Person p = entityManager.find(Person.class, 1);
		if(p != null) {
			System.out.println(p.getName() + ", " + p.getVorname());
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void testDelete() {
		Person p = new Person();
		p.setId(1);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		p = entityManager.merge(p);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void testUpdate() {
		Person p = new Person();
		p.setId(2);
		p.setName("Jahi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(p);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void selectAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        List<Person> result = entityManager.createQuery( "from Person", Person.class ).getResultList();
		for ( Person person : result ) {
			System.out.println( "Person (" + person.getId() + ") : " + person.getName() + ", " + person.getVorname() );
		}
        entityManager.getTransaction().commit();
        entityManager.close();
	}

	public void close() {
		entityManagerFactory.close();
	}
	

}
