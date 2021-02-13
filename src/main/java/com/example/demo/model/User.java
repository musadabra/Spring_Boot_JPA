package com.example.demo.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String username;
    private String password;
    private String mobile;
    private String enabled;

    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String email, String username, String password, String mobile, String enable) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.enabled = enable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEnable() {
        return enabled;
    }

    public void setEnable(String enable) {
        this.enabled = enable;
    }

}
