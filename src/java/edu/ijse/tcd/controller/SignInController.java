/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Customer;
import edu.ijse.tcd.dto.User;
import edu.ijse.tcd.service.CustomerService;
import edu.ijse.tcd.service.SignInService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author asankad
 */
@Controller
@RequestMapping("/")
public class SignInController {

    @Autowired
    private SignInService signInService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "signIn", method = RequestMethod.GET)
    public String loadSignIn(ModelMap map) {
        User user = new User();
        map.addAttribute("userMap", user);
        return "signIn";
    }

    @RequestMapping(value = "addSignIn", method = RequestMethod.POST)
    public String addSignIn(@Valid User user, Model model, HttpServletRequest request, @RequestParam("conpassword") String confirmPass) {

//        String password = user.getPassword();
//        String[] split = password.split(",");
//
////        HttpSession session = request.getSession();
////        
//        if (split.length > 1) {
//            if (!split[0].equals(split[1])) {
//                user.setPassword(split[0]);
//                map.addAttribute("userMap", user);
//                map.addAttribute("userConfirm", split[1]);
//                return "signIn";
//            }
//        }
//        user.setPassword(split[0]);
//        signInService.addSignIn(user);
//
////        session.getAttribute("user");
////        session.setAttribute("user", user);
        if (user.getName().isEmpty() || user.getPassword().isEmpty() || confirmPass.isEmpty()) {
            if (user.getName().isEmpty()) {
                model.addAttribute("error", "Please input username");
            } else if (user.getPassword().isEmpty()) {
                model.addAttribute("error", "Please input password");
            } else if (confirmPass.isEmpty()) {
                model.addAttribute("error", "Please confirm password");
            }
            model.addAttribute("userMap", user);
            return "signIn";
        } else {
            if (!user.getPassword().equals(confirmPass)) {
                model.addAttribute("error", "Passwords don't match");
                model.addAttribute("userMap", user);
                return "signIn";
            } else {
                signInService.addSignIn(user);
                return "adminPannel";
            }
        }
    }
}
