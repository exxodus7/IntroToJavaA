package com.mc.jpatutorial;

import com.mc.jpatutorial.model.Customer;
import com.mc.jpatutorial.model.DiscountCode;
import com.mc.jpatutorial.model.MicroMarket;
import com.mc.jpatutorial.persistence.CustomerPersistence;
import com.mc.jpatutorial.persistence.CustomerQuery;
import java.util.Collection;

/**
 *
 * @author lauren
 */
public class JPATutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // find all
        Collection<Customer> customers = CustomerQuery.findAll();

        for (Customer customer : customers) {
            System.out.println("Found customer: " + customer.getName());
        }

        // find by name
        Customer wren = CustomerQuery.findByName("Wren Computers");

        System.out.println("Name: " + wren.getName());
        System.out.println("Address:\n" + wren.getAddressline1() + "\n" 
                + wren.getAddressline2());
        System.out.println("Phone: " + wren.getPhone());

        // persist new customer
        Customer mosaicCenter = new Customer();
        mosaicCenter.setName("Mosaic Center");
        mosaicCenter.setCustomerId(14);
        mosaicCenter.setDiscountCode(new DiscountCode("L"));
        mosaicCenter.setZip(new MicroMarket("48128"));
        CustomerPersistence.persist(mosaicCenter);

        // find all
        for (Customer customer : CustomerQuery.findAll()) {
            System.out.println("Found customer: " + customer.getName());
        }
    }

}
