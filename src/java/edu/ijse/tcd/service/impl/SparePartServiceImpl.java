/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.service.impl;

import edu.ijse.tcd.dao.SparePartDAO;
import edu.ijse.tcd.dto.SparePart;
import edu.ijse.tcd.service.SparePartService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asankad
 */
@Service
public class SparePartServiceImpl implements SparePartService {

    @Autowired
    private SparePartDAO sparePartDAO;

    public boolean addSparePart(SparePart sparePart) {
        SparePart finalSparePart = sparePartDAO.getFinalSparePart();
        int sparePar = Integer.parseInt(finalSparePart.getPartId()) + 1;
        sparePart.setPartId(String.valueOf(sparePar));
        return sparePartDAO.addSparePart(sparePart);
    }

    public ArrayList<SparePart> getSparePart() {
        return sparePartDAO.getSpareParts();
    }
}
