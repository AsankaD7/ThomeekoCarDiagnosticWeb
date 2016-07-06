/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.CardDetailDAO;
import edu.ijse.tcd.dto.CardDetail;
import edu.ijse.tcd.service.CardDetailService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class CardDetailServiceImpl implements CardDetailService{

    @Autowired
    private CardDetailDAO cardDetailDAO;
    
    public ArrayList<CardDetail> getCardDetails() {
        return cardDetailDAO.getCardDetails();
    }

    public boolean addCardDetail(CardDetail cardDetail) {
        return cardDetailDAO.addCardDetail(cardDetail);
    }
    
}
