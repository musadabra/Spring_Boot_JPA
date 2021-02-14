package com.example.demo.request;

import com.example.demo.model.Vendor;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OfferForm {
    @NotBlank
    private Long id;

    @NotBlank
    private Long vendor_id;

    @NotBlank
    @Max(200)
    private String title;

    @NotBlank
    private String description;

    @NotNull
    @NotBlank
    private double amount;

    public OfferForm(){}

    public OfferForm(@NotBlank Long vendor_id, @NotBlank @Max(200) String title, @NotBlank String description, @NotNull @NotBlank double amount) {
        this.vendor_id = vendor_id;
        this.title = title;
        this.description = description;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(Long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
