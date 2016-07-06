/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Complaint;
import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.Grade;
import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.dto.User;
import edu.ijse.tcd.service.CustomerService;
import edu.ijse.tcd.service.GradeService;
import edu.ijse.tcd.service.JobCardService;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.DefaultEditorKit;
import javax.validation.Valid;
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
public class JobCardController {

    @Autowired
    private JobCardService jobCardService;

    @Autowired
    private GradeService gradeService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "jobCard", method = RequestMethod.GET)
    public String loadJobCard(ModelMap map, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null != user) {
            JobCard jobCard = new JobCard();
            ArrayList<JobCard> jobCards = jobCardService.getJobCards();
            map.addAttribute("jobCardList", jobCards);
            
            ArrayList<Grade> grades = gradeService.getGrades();
            map.addAttribute("grades", grades);
            
            ArrayList<Customer> customers = customerService.getCustomers();
            map.addAttribute("customers", customers);
            
            map.addAttribute("jobCard", jobCard);
            return "jobCard";
        } else {
            return "login";
        }
    }

    @RequestMapping(value = "addJobCard", method = RequestMethod.POST)
    public String addJobCard(@Valid JobCard jobCard,BindingResult bindingResult, ModelMap map) {        
        if(bindingResult.hasErrors()){
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        ArrayList<Grade> grades = gradeService.getGrades();
        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("jobCardList", jobCards);
        map.addAttribute("grades", grades);
        map.addAttribute("customers", customers);            
            return "jobCard";
        }
        jobCardService.addJobCard(jobCard);
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
        ArrayList<Grade> grades = gradeService.getGrades();
        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("grades", grades);
        map.addAttribute("customers", customers);         
        
        return "jobCard";
    }

    @RequestMapping(value = "deleteJobCard", method = RequestMethod.GET)
    public String deleteJobCard(ModelMap map, HttpServletRequest request) {
        String jobNum = request.getParameter("jobNum");
        jobCardService.deleteJobCard(jobNum);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);

        ArrayList<Grade> grades = gradeService.getGrades();
        map.addAttribute("grades", grades);

        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customers", customers);

        map.addAttribute("jobCard", new JobCard());
        return "jobCard";
    }

    @RequestMapping(value = "updateJobCard", method = RequestMethod.GET)
    public String loadUpdateJobCardr(ModelMap map, HttpServletRequest request) {
        String jobNum = request.getParameter("jobNum");
        JobCard jobCard = jobCardService.searchJobCardById(jobNum);
        map.addAttribute("jobCard", jobCard);

        ArrayList<Grade> grades = gradeService.getGrades();
        map.addAttribute("grades", grades);

        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customers", customers);
        return "updateJobCard";
    }

    @RequestMapping(value = "addUpdateJobCard", method = RequestMethod.POST)
    public String updateJobCard(@Valid JobCard jobCard,BindingResult bindingResult, ModelMap map) {
        if(bindingResult.hasErrors()){
        ArrayList<Grade> grades = gradeService.getGrades();
        map.addAttribute("grades", grades);

        ArrayList<Customer> customers = customerService.getCustomers();
        map.addAttribute("customers", customers);            
            
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);            
        return "updateJobCard";
        }
        jobCardService.updateJobCard(jobCard);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
        map.addAttribute("jobCard", new JobCard());
        return "jobCard";
    }

    @RequestMapping(value="viewJobCard",method = RequestMethod.GET)
    public String viewJobCard(ModelMap map){
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList",jobCards);   
        return "viewJobCard";
    }
    
    @RequestMapping(value = "searchJobCard",method = RequestMethod.GET)
    public String searchJobCard(ModelMap map,HttpServletRequest request){
        String parameter = request.getParameter("jobNum");
        JobCard jobCard = jobCardService.searchJobCardById(parameter);
        map.addAttribute("jobCard", jobCard);
        return "searchJobCard";
    }
}
