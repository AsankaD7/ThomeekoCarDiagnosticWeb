/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao;

import edu.ijse.tcd.dto.Customer;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface CustomerDAO {

    public boolean addCustomer(Customer customer);
    
    public Customer searchCustomerById(String id);

    public ArrayList<Customer> getCustomers();

    public Customer getFinalCustomer();

    public void deleteCustomer(String custId);

    public boolean updateCustomer(Customer customer);

}
