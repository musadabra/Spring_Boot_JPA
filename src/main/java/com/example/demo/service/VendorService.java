package com.example.demo.service;

import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.request.VendorForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public Object setVendors(VendorForm vendorForm) {

    }
}
