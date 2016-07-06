/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao;

import edu.ijse.tcd.dto.User;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface SignInDAO {

    public boolean addSignIn(User user);

    public User getUser(String username, String password);

}
