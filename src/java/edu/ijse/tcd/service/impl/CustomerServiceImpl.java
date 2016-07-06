/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.CustomerDAO;
import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.service.CustomerService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public boolean addCustomer(Customer customer) {
        Customer finalCustomer = customerDAO.getFinalCustomer();
        int custId = Integer.parseInt(finalCustomer.getCustomerId()) + 1;

        customer.setCustomerId(String.valueOf(custId));
        return customerDAO.addCustomer(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    public void deleteCustomer(String custId) {
        customerDAO.deleteCustomer(custId);
    }

    public boolean updateCustomer(Customer customer) {
        return customerDAO.updateCustomer(customer);
    }

    public Customer searchCustomerById(String id) {
        return customerDAO.searchCustomerById(id);
    }

}
