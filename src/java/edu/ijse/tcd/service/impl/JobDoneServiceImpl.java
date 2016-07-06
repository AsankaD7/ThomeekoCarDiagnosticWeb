/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.JobDoneDAO;
import edu.ijse.tcd.dto.JobDone;
import edu.ijse.tcd.service.JobDoneService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class JobDoneServiceImpl implements JobDoneService {

    @Autowired
    private JobDoneDAO jobDoneDAO;

    public boolean addJobDone(JobDone jobDone) {
        JobDone finalJobDone = jobDoneDAO.getFinalJobDone();
        int jobDoId = Integer.parseInt(finalJobDone.getJobDoneid()) + 1;
        jobDone.setJobDoneid(String.valueOf(jobDoId));
        return jobDoneDAO.addJobDone(jobDone);
    }

    public ArrayList<JobDone> getJobDones() {
        return jobDoneDAO.getJobDones();
    }

}
