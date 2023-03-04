package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ServiceProvider {

    // 1st attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 2nd attribute
    private String name;



    //3rd attribute
    @ManyToOne
    @JoinColumn
    private Admin admin;

    //4th attribute

    @ManyToMany(mappedBy = "serviceProviderList",cascade = CascadeType.ALL)
    List<User> users;

    //5th attribute
    @OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.ALL)
    List<Connection> connectionList;

    //6th attribute
    @OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.ALL)
    List<Country> countryList;





}
