/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao;

import edu.ijse.tcd.dto.JobFinish;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface JobFinishDAO {

    public boolean addJobFinish(JobFinish jobFinish);

    public ArrayList<JobFinish> getJobFinish();

    public JobFinish getFinalJobFinish();
}