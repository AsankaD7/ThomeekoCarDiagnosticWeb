/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.dto.JobFinish;
import edu.ijse.tcd.service.JobCardService;
import edu.ijse.tcd.service.JobFinishService;
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
public class JobFinishController {

    @Autowired
    private JobFinishService jobFinishService;

    @Autowired
    private JobCardService jobCardService;

    @RequestMapping(value = "jobFinish", method = RequestMethod.GET)
    public String loadJobFinish(ModelMap map) {
        JobFinish jobFinish = new JobFinish();
        map.addAttribute("jobFinish", jobFinish);

        ArrayList<JobFinish> jobFinishs = jobFinishService.getJobFinish();
        map.addAttribute("jobFinishList", jobFinishs);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);

        return "jobFinish";
    }

    @RequestMapping(value = "addJobFinish", method = RequestMethod.POST)
    public String addJobFinish(@Valid JobFinish jobFinish,BindingResult bindingResult, ModelMap map) {
        if(bindingResult.hasErrors()){
        map.addAttribute("jobFinish", jobFinish);

        ArrayList<JobFinish> jobFinishs = jobFinishService.getJobFinish();
        map.addAttribute("jobFinishList", jobFinishs);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
        return "jobFinish";
        }
        jobFinishService.addJobFinish(jobFinish);

        ArrayList<JobFinish> jobFinishs = jobFinishService.getJobFinish();
        map.addAttribute("jobFinishList", jobFinishs);

        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);

        map.addAttribute("jobFinish", new JobFinish());
        return "jobFinish";
    }
}
