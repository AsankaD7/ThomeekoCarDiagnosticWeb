/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.JobCardDAO;
import edu.ijse.tcd.dto.JobCard;
import java.util.ArrayList;
import java.util.List;
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
public class JobCardDAOImpl implements JobCardDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addJobCard(JobCard jobCard) {
        Session session = getSession();
        session.beginTransaction();
        session.save(jobCard);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<JobCard> getJobCards() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("JobCard.findAll");
        ArrayList<JobCard> jobCards = (ArrayList<JobCard>) namedQuery.list();
        if (jobCards == null) {
            jobCards = new ArrayList<JobCard>();
        }
        return jobCards;
    }

    public ArrayList<JobCard> getJobCardDetail(String jobNumber) {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("JobCard.findByJobNumber");
        namedQuery.setString("jobNumber", jobNumber);
        ArrayList<JobCard> jobCards = (ArrayList<JobCard>) namedQuery.list();
        if (jobCards == null) {
            jobCards = new ArrayList<JobCard>();
        }
        return jobCards;
    }

    public JobCard getFinalJobCard() {

        ArrayList<JobCard> jobCards = getJobCards();
        if (jobCards.size() > 0) {
            return jobCards.get(jobCards.size() - 1);
        }

        JobCard jobCard = new JobCard();
        jobCard.setJobNumber("0");

        return jobCard;
    }

    public void deleteJobCard(String jobNum) {
        Session session = getSession();
        session.beginTransaction();

        Query createQuery = session.createQuery("DELETE FROM JobCard WHERE jobNumber = :jobNumber");
        createQuery.setString("jobNumber", jobNum);
        createQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public JobCard searchJobCardById(String jobNum) {
        Session session = getSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("JobCard.findByJobNumber");
        query.setString("jobNumber", jobNum);
        List<JobCard> jList = query.list();
        if (jList.size() > 0) {
            return jList.get(0);
        }
        return null;
    }

    public boolean updateJobCard(JobCard jobCard) {
        Session session = getSession();
        session.beginTransaction();
        session.update(jobCard);
        session.getTransaction().commit();
        session.close();
        return true;       
    }

}
