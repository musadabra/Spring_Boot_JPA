package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name= "vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String email;
    private String category;

    public Vendor(){}

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }


}
