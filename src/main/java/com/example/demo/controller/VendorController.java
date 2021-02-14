package com.example.demo.controller;

import com.example.demo.request.VendorForm;
import com.example.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@Controller
public class VendorController {

    @Autowired
    VendorService vendorService;


    @GetMapping("/vendor")
    public String vendorPage(Model model){

        //PROVIDE VENDOR OBJECT DATA TO PAGE
        model.addAttribute("vendors", vendorService.getVendors());

        //PROVIDE VENDOR FORM OBJECT TO FORMS
        model.addAttribute("vendorForm", new VendorForm());

        return "admin/vendor";
    }

    @PostMapping("/vendor")
    public String vendorPageAfterSubmit(@Valid VendorForm vendorForm, BindingResult bindingResult, Model model){


        if(bindingResult.hasErrors())
            return "admin/vendor";

        //PROVIDE RESPONSE TO PAGE IN MESSAGE VARIABLE
        model.addAttribute("message", vendorService.setVendor(vendorForm));

        //PROVIDE VENDOR OBJECT DATA TO PAGE
        model.addAttribute("vendors", vendorService.getVendors());

        //PROVIDE VENDOR FORM OBJECT TO FORMS
        model.addAttribute("vendorForm", new VendorForm());

        return "admin/vendor";
    }

    //DELETE A VENDOR
    @GetMapping("/deletevendor/{id}")
    public String deleteVendor(@PathVariable Long id, Model model){

        //PROVIDE RESPONSE TO PAGE IN MESSAGE VARIABLE
        model.addAttribute("message", vendorService.deleteVendor(id));

        //PROVIDE VENDOR OBJECT DATA TO PAGE
        model.addAttribute("vendors", vendorService.getVendors());

        //PROVIDE OFFERS OBJECT  TO PAGE
        model.addAttribute("offers", new VendorForm());

        //PROVIDE VENDOR FORM OBJECT TO FORMS
        model.addAttribute("vendorForm", new VendorForm());



        return "admin/vendor";
    }

}
