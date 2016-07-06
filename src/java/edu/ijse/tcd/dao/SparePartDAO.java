/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.dao;

import edu.ijse.tcd.dto.SparePart;
import java.util.ArrayList;

/**
 *
 * @author asankad
 */
public interface SparePartDAO {

    public boolean addSparePart(SparePart sparePart);

    public ArrayList<SparePart> getSpareParts();

    public SparePart getFinalSparePart();
}
