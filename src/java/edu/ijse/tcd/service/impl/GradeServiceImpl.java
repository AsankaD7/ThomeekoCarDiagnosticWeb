/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.GradeDAO;
import edu.ijse.tcd.dto.Grade;
import edu.ijse.tcd.service.GradeService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDAO gradeDAO;

    public boolean addGrade(Grade grade) {
        return gradeDAO.addGrade(grade);
    }

    public ArrayList<Grade> getGrades() {
        return gradeDAO.gatGrades();
    }

}
