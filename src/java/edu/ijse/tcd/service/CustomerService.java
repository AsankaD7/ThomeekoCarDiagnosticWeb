/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service;

import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.JobCard;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface CustomerService {

    public boolean addCustomer(Customer customer);

    public ArrayList<Customer> getCustomers();

    public void deleteCustomer(String custId);

    public boolean updateCustomer(Customer customer);
    
    public Customer searchCustomerById(String id);
}
