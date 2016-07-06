/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.User;
import edu.ijse.tcd.service.SignInService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asankad
 */
@Controller
@RequestMapping("/")
public class LogInController {

    @Autowired
    private SignInService signInService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loadLogIn(ModelMap map) {
        User user = new User();

        map.addAttribute("userMap", user);

        return "login";
    }

    @RequestMapping(value = "addLogIn", method = RequestMethod.POST)
    public String addLogIn(ModelMap map, HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = signInService.getUser(username, password);

        if (null != user) {
            HttpSession hs = request.getSession();
            hs.setAttribute("user", user);
            return "adminPannel";
        } else {
            return "login";
        }
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(ModelMap map, HttpServletRequest request) {
        HttpSession hs = request.getSession();
        hs.removeAttribute("user");
        return "login";
    }

}
