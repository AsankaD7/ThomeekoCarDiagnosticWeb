/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.CustomerDAO;
import edu.ijse.tcd.dto.Customer;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asankad
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addCustomer(Customer customer) {
        Session session = getSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<Customer> getCustomers() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("Customer.findAll");
        ArrayList<Customer> customers = (ArrayList<Customer>) namedQuery.list();
        if (customers == null) {
            customers = new ArrayList<Customer>();
        }
        return customers;
    }

    public Customer getFinalCustomer() {
        ArrayList<Customer> customers = getCustomers();
        if (customers.size() > 0) {
            return customers.get(customers.size() - 1);
        }

        Customer customer = new Customer();
        customer.setCustomerId("0");
        return customer;
    }

    public void deleteCustomer(String custId) {
        Session session = getSession();
        session.beginTransaction();

        Query createQuery = session.createQuery("DELETE FROM Customer WHERE customerId = :customerId");
        createQuery.setString("customerId", custId);
        createQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public boolean updateCustomer(Customer customer) {
        Session session = getSession();
        session.beginTransaction();
        session.update(customer);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public Customer searchCustomerById(String id) {
        Session session = getSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("Customer.findByCustomerId");
        query.setString("customerId", id);
        List<Customer> customerList = query.list();
        if (customerList.size() > 0) {
            return customerList.get(0);
        }
        return null;
    }
}
