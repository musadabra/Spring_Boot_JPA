package com.example.demo.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class VendorForm {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 2, max = 200)
    private String name;

    public VendorForm(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VendorForm{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
