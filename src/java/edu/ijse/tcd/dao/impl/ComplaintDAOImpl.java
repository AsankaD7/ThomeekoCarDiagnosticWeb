/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.ComplaintDAO;
import edu.ijse.tcd.dto.Complaint;
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
public class ComplaintDAOImpl implements ComplaintDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addComplaint(Complaint complaint) {
        Session session = getSession();
        session.beginTransaction();
        session.save(complaint);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<Complaint> getComplaint() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("Complaint.findAll");
        ArrayList<Complaint> complaints = (ArrayList<Complaint>) namedQuery.list();
        if (complaints == null) {
            complaints = new ArrayList<Complaint>();
        }
        return complaints;
    }

    public Complaint getFinalComplaint() {
        ArrayList<Complaint> complaints = getComplaint();
        if (complaints.size() > 0) {
            return complaints.get(complaints.size() - 1);
        }

        Complaint complaint = new Complaint();
        complaint.setComplaintId("0");
        return complaint;
    }

}
