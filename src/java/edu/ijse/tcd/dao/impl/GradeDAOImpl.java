/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.GradeDAO;
import edu.ijse.tcd.dto.Grade;
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
public class GradeDAOImpl implements GradeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addGrade(Grade grade) {
        Session session = getSession();
        session.beginTransaction();
        session.save(grade);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public ArrayList<Grade> gatGrades() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("Grade.findAll");
        ArrayList<Grade> grades = (ArrayList<Grade>) namedQuery.list();
        if (grades == null) {
            grades = new ArrayList<Grade>();
        }
        return grades;
    }

}
