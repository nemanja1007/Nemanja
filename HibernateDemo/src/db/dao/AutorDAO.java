package db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db.model.Autor;

public class AutorDAO {
    private EntityManagerFactory entityManagerFactory;

    public AutorDAO()
    {
        entityManagerFactory = Persistence.createEntityManagerFactory( "Buch.jpa" );
    }

    //Speichert eine Person in der Datenbank
    public void insert(Autor p)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void update(Autor p)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        p = entityManager.merge(p);
        entityManager.persist(p);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(int id)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Autor p = new Autor();
        p.setId(id);
        p = entityManager.merge(p);
        entityManager.remove(p);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    //Lesen der Daten
    public List<Autor> selectAll()
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Autor> result = entityManager.createQuery( "from Autor", Autor.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }
}