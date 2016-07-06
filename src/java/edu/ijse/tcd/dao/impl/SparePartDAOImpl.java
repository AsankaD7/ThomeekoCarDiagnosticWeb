/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.SparePartDAO;
import edu.ijse.tcd.dto.SparePart;
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
public class SparePartDAOImpl implements SparePartDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addSparePart(SparePart sparePart) {
        Session session = getSession();
        session.beginTransaction();
        session.save(sparePart);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<SparePart> getSpareParts() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("SparePart.findAll");
        ArrayList<SparePart> spareParts = (ArrayList<SparePart>) namedQuery.list();
        if (spareParts == null) {
            spareParts = new ArrayList<SparePart>();
        }
        return spareParts;
    }

    public SparePart getFinalSparePart() {
        ArrayList<SparePart> spareParts = getSpareParts();
        if (spareParts.size() > 0) {
            return spareParts.get(spareParts.size() - 1);
        }
        SparePart sparePart = new SparePart();
        sparePart.setPartId("0");
        return sparePart;
    }

}
