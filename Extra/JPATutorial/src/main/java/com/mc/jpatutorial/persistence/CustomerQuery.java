/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.jpatutorial.persistence;

import com.mc.jpatutorial.model.Customer;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author lauren
 */
public class CustomerQuery {
    public static Collection<Customer> findAll() {
        EntityManagerFactory emfactory 
                = Persistence.createEntityManagerFactory("JPATutorialPU");
        EntityManager em = emfactory.createEntityManager();

        Query query = em.createNamedQuery("Customer.findAll");
        Collection<Customer> customers = query.getResultList();

        em.close();
        emfactory.close();

        return customers;
    }
    
    public static Customer findByName(String name) {
        EntityManagerFactory emfactory 
                = Persistence.createEntityManagerFactory("JPATutorialPU");
        EntityManager em = emfactory.createEntityManager();

        Query query = em.createNamedQuery("Customer.findByName")
                .setParameter("name", name);
        Customer customer = (Customer) query.getSingleResult();

        em.close();
        emfactory.close();

        return customer;
    }
}
