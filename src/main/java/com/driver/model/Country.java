package com.driver.model;

import javax.persistence.*;

// Note: Do not write @Enumerated annotation above CountryName in this model.
@Entity
@Table
public class Country {


    //1st attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //2nd Attribute
    private CountryName countryName;

    //3rd attribute
    private String code;

    //4th attribute
    @OneToOne
    @JoinColumn
    private User user;

    //5th attribute
    @ManyToOne
    @JoinColumn
    private  ServiceProvider serviceProvider;

}