/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.SignInDAO;
import edu.ijse.tcd.dto.User;
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
public class SignInDAOImpl implements SignInDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addSignIn(User user) {
        Session session = getSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public User getUser(String username, String password) {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("User.findByNameAndPassword");
        namedQuery.setString("name", username);
        namedQuery.setString("password", password);
        User users = (User) namedQuery.uniqueResult();
        return users;
    }

}
