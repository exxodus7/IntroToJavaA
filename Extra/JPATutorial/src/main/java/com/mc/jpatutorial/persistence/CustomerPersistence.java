package com.mc.jpatutorial.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lauren
 */
public class CustomerPersistence {
    public static void persist(Object object) {
        EntityManagerFactory emfactory 
                = Persistence.createEntityManagerFactory("JPATutorialPU");
        EntityManager em = emfactory.createEntityManager();

        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
    }
}
