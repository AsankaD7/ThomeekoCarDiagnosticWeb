/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service;

import edu.ijse.tcd.dto.JobCard;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface JobCardService {

    public boolean addJobCard(JobCard jobCard);

    public ArrayList<JobCard> getJobCards();

    public ArrayList<JobCard> getJobCardDetail(String jobNumber);

    public void deleteJobCard(String jobNum);

    public JobCard searchJobCardById(String jobNum);

    public boolean updateJobCard(JobCard jobCard);
}
