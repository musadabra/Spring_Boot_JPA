package com.example.demo.controller;

import com.example.demo.repository.VendorRepository;
import com.example.demo.request.OfferForm;
import com.example.demo.service.OfferService;
import com.example.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class OfferController {
    @Autowired
    VendorService vendorService;

    @Autowired
    OfferService offerService;

    @GetMapping("/offer")
    public String offerPage(Model model){
        //PROVIDE VENDOR OBJECT DATA TO PAGE
        model.addAttribute("vendors", vendorService.getVendors());

        //OFFERS BY Offers by Vendors
        model.addAttribute("offers", offerService.getOffers());

        //THE OFFER FORM OBJECT
        model.addAttribute("offerForm", new OfferForm());

        return "admin/offer";
    }

    @PostMapping("/offer")
    public String createOffer(@Valid OfferForm offerForm, BindingResult bindingResult, Model model){
        //PROVIDE VENDOR OBJECT DATA TO PAGE
        model.addAttribute("vendors", vendorService.getVendors());

        //OFFERS BY Offers by Vendors
        model.addAttribute("offers", offerService.getOffers());


        //CHECK VALIDATION
        if(bindingResult.hasErrors()){
            model.addAttribute("error", bindingResult.getAllErrors());
            return "admin/offer";
        }

        model.addAttribute("message", offerService.createOffer(offerForm));
        model.addAttribute("offerForm", offerForm);

        return "admin/offer";
    }
}
