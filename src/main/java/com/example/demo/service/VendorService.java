package com.example.demo.service;

import com.example.demo.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    @Autowired
    VendorRepository vendorRepository;
}
