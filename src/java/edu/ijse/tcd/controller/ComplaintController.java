/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Complaint;
import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.dto.JobDone;
import edu.ijse.tcd.service.ComplaintService;
import edu.ijse.tcd.service.JobCardService;
import edu.ijse.tcd.service.JobDoneService;
import java.util.ArrayList;
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
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @Autowired
    private JobCardService jobCardService;

    @Autowired
    private JobDoneService JobDoneService;

    @RequestMapping(value = "complaint", method = RequestMethod.GET)
    public String loadComplaint(ModelMap map) {
        Complaint complaint = new Complaint();
        ArrayList<Complaint> complaints = complaintService.getComplaints();

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCards", jobCards);

        map.addAttribute("complaint", complaint);
        map.addAttribute("ComplaintList", complaints);

        return "complaint";
    }

    @RequestMapping(value = "addComplaint", method = RequestMethod.POST)
    public String addComplaint(@Valid Complaint complaint,BindingResult bindingResult, ModelMap map) {
        
        if(bindingResult.hasErrors()){
        ArrayList<Complaint> complaints = complaintService.getComplaints();

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCards", jobCards);

        map.addAttribute("complaint", complaint);
        map.addAttribute("ComplaintList", complaints);            
            
            return "complaint";
        }
        complaintService.addComplaint(complaint);

        ArrayList<Complaint> complaints = complaintService.getComplaints();
        map.addAttribute("ComplaintList", complaints);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCards", jobCards);

        map.addAttribute("complaint", new Complaint());
        return "complaint";

    }

}
