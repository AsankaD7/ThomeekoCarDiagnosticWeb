/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.JobCardDAO;
import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.service.JobCardService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class JobCardServiceImpl implements JobCardService {

    @Autowired
    private JobCardDAO jobCardDAO;

    public boolean addJobCard(JobCard jobCard) {

        JobCard finalJobCard = jobCardDAO.getFinalJobCard();
        int jobNum = Integer.parseInt(finalJobCard.getJobNumber()) + 1;

        jobCard.setJobNumber(String.valueOf(jobNum));
        return jobCardDAO.addJobCard(jobCard);
    }

    public ArrayList<JobCard> getJobCards() {
        return jobCardDAO.getJobCards();
    }

    public ArrayList<JobCard> getJobCardDetail(String jobNumber) {
        return jobCardDAO.getJobCardDetail(jobNumber);
    }

    public void deleteJobCard(String jobNum) {
        jobCardDAO.deleteJobCard(jobNum);
    }

    public JobCard searchJobCardById(String jobNum) {
        return jobCardDAO.searchJobCardById(jobNum);
    }

    public boolean updateJobCard(JobCard jobCard) {
        return jobCardDAO.updateJobCard(jobCard);
    }

}
