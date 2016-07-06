/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao.impl;

import edu.ijse.tcd.dao.CardDetailDAO;
import edu.ijse.tcd.dto.CardDetail;
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
public class CardDetaiDAOImpl implements CardDetailDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.openSession();
    }
    
    public ArrayList<CardDetail> getCardDetails() {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("CardDetail.findAll");
        ArrayList<CardDetail> cardDetails = (ArrayList<CardDetail>) namedQuery.list();
        if (cardDetails == null) {
            cardDetails = new ArrayList<CardDetail>();
        }
        return cardDetails;
    }

    public boolean addCardDetail(CardDetail cardDetail) {
        Session session = getSession();
        session.beginTransaction();
        session.save(cardDetail);
        session.getTransaction().commit();
        session.close();
        return true;    
    }
    
}
