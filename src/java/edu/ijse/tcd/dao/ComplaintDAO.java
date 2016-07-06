/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao;

import edu.ijse.tcd.dto.Complaint;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface ComplaintDAO {

    public boolean addComplaint(Complaint complaint);

    public ArrayList<Complaint> getComplaint();

    public Complaint getFinalComplaint();
}
