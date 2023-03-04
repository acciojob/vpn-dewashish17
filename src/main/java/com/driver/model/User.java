package com.driver.model;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.List;

@Entity
@Table
public class User {

    // 1st attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //2nd attribute
    private String username;

    // 3rd attribute
    private String password;

    //4th attribute
    private String originalIp;

    //5th attribute
    private String maskedIp;

    //6th attribute
    private Boolean connected;

    //7th attribute
    @ManyToMany
    @JoinTable(name = "user_service_provider",joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name = "id"))
    List<ServiceProvider> serviceProviderList;

    //8th attribute
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Connection> connectionList;

    //9th attribute
    @OneToOne(mappedBy = "user")
    Country country;




}
