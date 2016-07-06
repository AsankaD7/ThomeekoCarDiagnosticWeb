/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.SignInDAO;
import edu.ijse.tcd.dto.User;
import edu.ijse.tcd.service.SignInService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private SignInDAO signInDAO;

    public boolean addSignIn(User user) {
        return signInDAO.addSignIn(user);
    }

    public User getUser(String username, String password) {
        return signInDAO.getUser(username, password);
    }

}
