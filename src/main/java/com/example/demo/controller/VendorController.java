package com.example.demo.controller;

import com.example.demo.request.VendorForm;
import com.example.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.websocket.server.PathParam;

@Controller
public class VendorController {

    @Autowired
    VendorService vendorService;

    @GetMapping("/vendor")
    public String vendorPage(Model model){
        model.addAttribute("vendors", vendorService.getVendors());
        return "admin/vendor";
    }

    @PostMapping("/createvendor")
    public String vendorPageAfterSubmit(@ModelAttribute VendorForm vendorForm, Model model){
        model.addAttribute("messaeg", vendorService.setVendors(vendorForm));
        try {
            String resp = vendorService.setVendors((vendorForm);
            model.addAttribute("message", resp);
            return "admin/vendor";
        }catch(Exception e){
            model.addAttribute("message", vendorForm.getName()+" is failed to add");
            return "admin/vendor";
        }
        return "admin/vendor";
    }

}
