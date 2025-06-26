package com.jpa.poc.JpaPoc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;

    @OneToOne
    @JoinColumn(name="user_Id")
    @JsonIgnore
    private User user;

    public Nationality(Long id, String country, User user) {
        this.id = id;
        this.country = country;
        this.user = user;
    }

    public Nationality() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
