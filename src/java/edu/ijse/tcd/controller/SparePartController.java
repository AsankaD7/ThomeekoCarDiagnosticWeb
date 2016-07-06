/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.SparePart;
import edu.ijse.tcd.service.SparePartService;
import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asankad
 */
@Controller
@RequestMapping("/")
public class SparePartController {

    @Autowired
    private SparePartService sparePartService;

    @RequestMapping(value = "sparePart", method = RequestMethod.GET)
    public String loadSparePart(ModelMap map) {
        SparePart sparePart = new SparePart();
        ArrayList<SparePart> spareParts = sparePartService.getSparePart();

        map.addAttribute("SparePartList", spareParts);
        map.addAttribute("sparePart", sparePart);
        return "sparePart";
    }

    @RequestMapping(value = "addSparePart", method = RequestMethod.POST)
    public String addSparePart(@Valid SparePart sparePart,BindingResult bindingResult, ModelMap map) {
        if(bindingResult.hasErrors()){
        ArrayList<SparePart> spareParts = sparePartService.getSparePart();

        map.addAttribute("SparePartList", spareParts);
        map.addAttribute("sparePart", sparePart);
        return "sparePart";
        }
        sparePartService.addSparePart(sparePart);
        ArrayList<SparePart> spareParts = sparePartService.getSparePart();

        map.addAttribute("SparePartList", spareParts);
        map.addAttribute("sparePart", new SparePart());
        return "sparePart";
    }
}
