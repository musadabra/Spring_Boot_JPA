package com.example.demo.service;

import com.example.demo.model.Offer;
import com.example.demo.model.Vendor;
import com.example.demo.repository.OfferRepository;
import com.example.demo.repository.VendorRepository;
import com.example.demo.request.OfferForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    @Autowired
    VendorRepository vendorRepository;

    public List<Offer> getOffers(){
        List<Offer> result = new ArrayList<>();
        Iterable<Offer> offers = offerRepository.findAll();
        for(Offer offer: offers)
            result.add(offer);
        return result;
    }

    public String createOffer(OfferForm offerForm) {
       Vendor vendor = vendorRepository.getById(offerForm.getVendor_id());
       Offer offer = new Offer(vendor ,offerForm.getTitle(), offerForm.getDescription(), offerForm.getAmount());
       offerRepository.save(offer);
       return "Offer Created";
    }

//    public Object getOffersByVendors() {
//    }
}
