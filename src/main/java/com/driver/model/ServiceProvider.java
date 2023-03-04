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

    public ServiceProvider() {
    }

    public ServiceProvider(int id, String name, Admin admin, List<User> users, List<Connection> connectionList, List<Country> countryList) {
        this.id = id;
        this.name = name;
        this.admin = admin;
        this.users = users;
        this.connectionList = connectionList;
        this.countryList = countryList;
    }

    public ServiceProvider(String name, Admin admin) {
        this.name = name;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
