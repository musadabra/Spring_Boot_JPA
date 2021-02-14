package com.example.demo.request;

import javax.validation.constraints.*;

public class VendorForm {

    private Long id;

    @NotNull
    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 2, max = 200)
    private String name;

    @NotBlank
    private String category;

    public VendorForm(String email, String name, String category) {
        this.email = email;
        this.name = name;
        this.category = category;
    }

    public VendorForm() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VendorForm{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
