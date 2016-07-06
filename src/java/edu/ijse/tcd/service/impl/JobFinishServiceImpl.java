/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.JobFinishDAO;
import edu.ijse.tcd.dto.JobFinish;
import edu.ijse.tcd.service.JobFinishService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class JobFinishServiceImpl implements JobFinishService {

    @Autowired
    private JobFinishDAO jobFinishDAO;

    public boolean addJobFinish(JobFinish jobFinish) {
        JobFinish finalFinish = jobFinishDAO.getFinalJobFinish();
        int jobFinId = Integer.parseInt(finalFinish.getJobFinishid()) + 1;

        jobFinish.setJobFinishid(String.valueOf(jobFinId));
        return jobFinishDAO.addJobFinish(jobFinish);
    }

    public ArrayList<JobFinish> getJobFinish() {
        return jobFinishDAO.getJobFinish();
    }

}
