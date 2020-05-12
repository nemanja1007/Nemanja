package db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db.model.Buch;

public class BuchDAO {
    private EntityManagerFactory entityManagerFactory;

    public BuchDAO()
    {
        entityManagerFactory = Persistence.createEntityManagerFactory( "Buch.jpa" );
    }

    //Speichert eine Person in der Datenbank
    public void insert(Buch b)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        b = entityManager.merge(b);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void update(Buch b)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        b = entityManager.merge(b);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Buch b)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        b = entityManager.merge(b);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    //Lesen der Daten
    public List<Buch> selectAll()
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Buch> result = entityManager.createQuery( "from Buch", Buch.class ).getResultList();
        entityManager.getTransaction().commit();
       // entityManager.close();
        return result;
    }
}