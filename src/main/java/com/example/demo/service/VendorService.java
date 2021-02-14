package com.example.demo.service;

import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.request.VendorForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    @Autowired
    VendorRepository vendorRepository;

    public List<Vendor> getVendors(){
        List<Vendor> result = new ArrayList<>();
        Iterable<Vendor> vendors = vendorRepository.findAll();
        for(Vendor vendor: vendors)
            result.add(vendor);
        return result;
    }

    public String setVendor(VendorForm vendorForm) {

        if(vendorRepository.existsByEmail(vendorForm.getEmail()))
            return "Vendor with this email already exist";

        if(vendorRepository.existsByName(vendorForm.getName()))
            return "Vendor name alredy exist";

        vendorRepository.save(new Vendor(vendorForm.getName(), vendorForm.getEmail(), vendorForm.getCategory()));
        return "Went through";
    }

    public String deleteVendor(Long id) {

        if(vendorRepository.existsById(id)){
            vendorRepository.deleteById(id);
            return "Vendor Deleted!";
        }
        return "Vendor is not found";

    }
}
