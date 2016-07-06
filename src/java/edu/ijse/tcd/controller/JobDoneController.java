/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Complaint;
import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.dto.JobDone;
import edu.ijse.tcd.service.ComplaintService;
import edu.ijse.tcd.service.CustomerService;
import edu.ijse.tcd.service.JobCardService;
import edu.ijse.tcd.service.JobDoneService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asankad
 */
@Controller
@RequestMapping("/")
public class JobDoneController {

    @Autowired
    private JobDoneService jobDoneService;

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private JobCardService jobCardService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "jobDone", method = RequestMethod.GET)
    public String loadJobDone(ModelMap map) {
        JobDone jobDone = new JobDone();
        map.addAttribute("jobDoneMap", jobDone);

////        ArrayList<JobDone> jobDones = jobDoneService.getJobDones();
//        
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
//        
//        ArrayList<Customer> customers = customerService.getCustomers();
//        map.addAttribute("customers", customers);
//        
//        ArrayList<Complaint> complaints = complaintService.getComplaints();
//        map.addAttribute("complaints", complaints);
////
////        map.addAttribute("JobDoneList", jobDones);
//        
        return "jobDone";
    }

    @RequestMapping(value = "getJobDone", method = RequestMethod.GET)
    public String getDetail(ModelMap map, HttpServletRequest request) {
        String jobNumber = request.getParameter("jobnumber");
        ArrayList<JobCard> jobCards = jobCardService.getJobCardDetail(jobNumber);
        JobCard jobCard = new JobCard();
        if (jobCards.size() > 0) {
            jobCard = jobCards.get(0);
        }
        ArrayList<JobDone> jobDones = jobDoneService.getJobDones();
        map.addAttribute("jobDoneList", jobDones);
        
        map.addAttribute("jobCardList", jobCards);
        HttpSession hs = request.getSession();
        hs.getAttribute("jobCardDone");
        hs.setAttribute("jobCardDone", jobCard);
        map.addAttribute("jobCardDone", jobCard);
        return "jobDone";
    }

    @RequestMapping(value = "addJobDone", method = RequestMethod.GET)
    public String addJobDone(ModelMap map, HttpServletRequest request) {
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
        
        String complaint = request.getParameter("complain");
        Complaint c = new Complaint();
        c.setComplaintId(complaint);

        String nature = request.getParameter("nature");
        String amount = request.getParameter("amount");

        JobDone jobDone = new JobDone();
        jobDone.setJobDoneid("0");
        jobDone.setComplaintId(c);
        jobDone.setNature(nature);
        jobDone.setAmount(Integer.parseInt(amount));
        jobDoneService.addJobDone(jobDone);

        HttpSession hs = request.getSession();

        JobCard jobCard = (JobCard) hs.getAttribute("jobCardDone");
        ArrayList<JobDone> jobDones = jobDoneService.getJobDones();
        map.addAttribute("jobDoneList", jobDones);
        map.addAttribute("jobCardDone", jobCard);
        map.addAttribute("jobDoneMap", jobDone);
        return "jobDone";
    }

}
