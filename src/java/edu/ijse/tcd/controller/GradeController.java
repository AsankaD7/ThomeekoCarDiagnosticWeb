/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.Grade;
import edu.ijse.tcd.service.GradeService;
import java.util.ArrayList;
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
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "grade", method = RequestMethod.GET)
    public String loadGrade(ModelMap map) {
        Grade grade = new Grade();
        ArrayList<Grade> grades = gradeService.getGrades();

        map.addAttribute("gradeMap", grade);
        map.addAttribute("gradeList", grades);
        return "grade";
    }

}
