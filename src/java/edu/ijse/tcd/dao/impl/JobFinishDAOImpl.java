/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.JobFinishDAO;
import edu.ijse.tcd.dto.JobFinish;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asankad
 */
@Repository
public class JobFinishDAOImpl implements JobFinishDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addJobFinish(JobFinish jobfinish) {
        Session session = getSession();
        session.beginTransaction();
        session.save(jobfinish);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<JobFinish> getJobFinish() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("JobFinish.findAll");
        ArrayList<JobFinish> jobFinishs = (ArrayList<JobFinish>) namedQuery.list();
        if (jobFinishs == null) {
            jobFinishs = new ArrayList<JobFinish>();
        }
        return jobFinishs;
    }

    public JobFinish getFinalJobFinish() {
        ArrayList<JobFinish> jobFinishs = getJobFinish();
        if (jobFinishs.size() > 0) {
            return jobFinishs.get(jobFinishs.size() - 1);
        }
        JobFinish jobFinish = new JobFinish();
        jobFinish.setJobFinishid("0");
        return jobFinish;
    }

}
