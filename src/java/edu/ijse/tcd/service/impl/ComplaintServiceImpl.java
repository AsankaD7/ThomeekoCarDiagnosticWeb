/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.ComplaintDAO;
import edu.ijse.tcd.dto.Complaint;
import edu.ijse.tcd.service.ComplaintService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 *
 */
@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintDAO complaintDAO;

    public boolean addComplaint(Complaint complaint) {
        Complaint finalcomplaint = complaintDAO.getFinalComplaint();
        int complain = Integer.parseInt(finalcomplaint.getComplaintId()) + 1;
        complaint.setComplaintId(String.valueOf(complain));
        return complaintDAO.addComplaint(complaint);
    }

    public ArrayList<Complaint> getComplaints() {
        return complaintDAO.getComplaint();
    }

}
