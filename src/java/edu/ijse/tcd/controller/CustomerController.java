/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.Grade;
import edu.ijse.tcd.dto.User;
import edu.ijse.tcd.service.CustomerService;
import edu.ijse.tcd.service.GradeService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asankad
 */
@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "customer", method = RequestMethod.GET)
    public String loadCustomer(ModelMap map,HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if(null != user){
        Customer customer = new Customer();
        ArrayList<Customer> customers = customerService.getCustomers();

        map.addAttribute("customer", customer);
        map.addAttribute("customerList", customers);
        return "customer";
        }else{
            return "login";
        }
    }

    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public String addCustomer(@Valid Customer customer,BindingResult bindingResult, ModelMap map) {
     
        if(bindingResult.hasErrors()){
        ArrayList<Customer> customers = customerService.getCustomers();            
        map.addAttribute("customerList", customers);
            return "customer";
        }
        customerService.addCustomer(customer);
        ArrayList<Customer> customers = customerService.getCustomers(); 
        map.addAttribute("customerList", customers);
        ArrayList<Grade> grades = gradeService.getGrades();
        map.addAttribute("grades", grades);

        map.addAttribute("customer", new Customer());
        return "customer";
    }

    @RequestMapping(value = "deleteCustomer", method = RequestMethod.GET)
    public String deleteCustomer(ModelMap map, HttpServletRequest request) {
        String custId = request.getParameter("custId");
        customerService.deleteCustomer(custId);

        Customer customer = new Customer();
        ArrayList<Customer> customers = customerService.getCustomers();

        map.addAttribute("customer", customer);
        map.addAttribute("customerList", customers);
        return "customer";
    }

    @RequestMapping(value = "updateCustomer", method = RequestMethod.GET)
    public String loadUpdateCustomer(ModelMap map, HttpServletRequest request) {
        String custId = request.getParameter("custId");
        Customer customer = customerService.searchCustomerById(custId);
        map.addAttribute("customer", customer);
        return "updateCustomer";
    }

    @RequestMapping(value = "addUpdateCustomer", method = RequestMethod.POST)
    public String updateCustomer(@Valid Customer customer,BindingResult bindingResult, ModelMap map) {
        if(bindingResult.hasErrors()){
        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customerList", customers);            
        return "updateCustomer";
        }
        customerService.updateCustomer(customer);
        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customerList", customers);
        map.addAttribute("customer", new Customer());
        return "customer";
    }
    
    @RequestMapping(value = "viewCustomer", method = RequestMethod.GET)
    public String viewCustomer(ModelMap map) {
        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customerList", customers);       
        return "viewCustomer";
    }
    @RequestMapping(value = "searchCustomer" ,method = RequestMethod.GET)
    public String searchCustomer(ModelMap map,HttpServletRequest request){
        String parameter = request.getParameter("custId");
        Customer customer = customerService.searchCustomerById(parameter);
        map.addAttribute("customer", customer);
        return "searchCustomer";
    }

}
