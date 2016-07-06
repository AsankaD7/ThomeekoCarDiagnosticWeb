/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.JobDoneDAO;
import edu.ijse.tcd.dto.JobDone;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.util.calendar.ZoneInfoFile;

/**
 *
 * @author asankad
 */
@Repository
public class JobDoneDAOImpl implements JobDoneDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addJobDone(JobDone jobDone) {
        Session session = getSession();
        session.beginTransaction();
        session.save(jobDone);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<JobDone> getJobDones() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("JobDone.findAll");
        ArrayList<JobDone> jobDones = (ArrayList<JobDone>) namedQuery.list();
        if (jobDones == null) {
            jobDones = new ArrayList<JobDone>();
        }
        return jobDones;
    }

    public JobDone getFinalJobDone() {
        ArrayList<JobDone> jobDones = getJobDones();
        if (jobDones.size() > 0) {
            return jobDones.get(jobDones.size() - 1);
        }

        JobDone jobDone = new JobDone();
        jobDone.setJobDoneid("0");
        return jobDone;        
    }

}
