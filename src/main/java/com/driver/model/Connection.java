package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Connection {

    //1st attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //2nd attribute

    @ManyToOne
    @JoinColumn
    private User user;


    //3rd attribute

    @ManyToOne
    @JoinColumn
    private ServiceProvider serviceProvider;
}
