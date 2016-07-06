/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.tcd.controller;

import edu.ijse.tcd.dto.CardDetail;
import edu.ijse.tcd.dto.CardDetailPK;
import edu.ijse.tcd.dto.JobCard;
import edu.ijse.tcd.dto.SparePart;
import edu.ijse.tcd.service.CardDetailService;
import edu.ijse.tcd.service.JobCardService;
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
public class CardDetailController {
    @Autowired
    private CardDetailService cardDetailService;
    
    @Autowired
    private SparePartService sparePartService;
    
    @Autowired
    private JobCardService jobCardService;
    
    @RequestMapping(value = "cardDetail" ,method = RequestMethod.GET)
    public String loadCardDetail(ModelMap map){
        CardDetail cardDetail = new CardDetail();
        ArrayList<CardDetail> cardDetails = cardDetailService.getCardDetails();
        
        ArrayList<SparePart> spareParts = sparePartService.getSparePart();
        map.addAttribute("sparePartList", spareParts);
        
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);
        
        map.addAttribute("cardDetailMap", cardDetail);
        map.addAttribute("cardDetailList", cardDetails);
        return "cardDetail";
    }
    
    @RequestMapping(value = "addCardDetail" ,method = RequestMethod.POST)
    public String addCardDetail(@Valid CardDetail cardDetail,BindingResult bindingResult,ModelMap map){
        cardDetail.setCardDetailPK(new CardDetailPK(cardDetail.getJobCard().getJobNumber(), cardDetail.getSparePart().getPartId()));
        cardDetailService.addCardDetail(cardDetail);
        ArrayList<CardDetail> cardDetails = cardDetailService.getCardDetails();
        
        ArrayList<SparePart> spareParts = sparePartService.getSparePart();
        map.addAttribute("sparePartList", spareParts);
        
        ArrayList<JobCard> jobCards = jobCardService.getJobCards();
        map.addAttribute("jobCardList", jobCards);        
        
        map.addAttribute("cardDetailMap", new CardDetail());
        map.addAttribute("cardDetailList", cardDetails);
        return "cardDetail";
    }
}
