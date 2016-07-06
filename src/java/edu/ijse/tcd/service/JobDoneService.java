/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service;

import edu.ijse.tcd.dto.JobDone;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface JobDoneService {

    public boolean addJobDone(JobDone jobDone);

    public ArrayList<JobDone> getJobDones();
}
