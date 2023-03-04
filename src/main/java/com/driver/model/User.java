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

    public User() {
    }

    public User(int id, String username, String password, String originalIp, String maskedIp, Boolean connected, List<ServiceProvider> serviceProviderList, List<Connection> connectionList, Country country) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.originalIp = originalIp;
        this.maskedIp = maskedIp;
        this.connected = connected;
        this.serviceProviderList = serviceProviderList;
        this.connectionList = connectionList;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOriginalIp() {
        return originalIp;
    }

    public void setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
    }

    public String getMaskedIp() {
        return maskedIp;
    }

    public void setMaskedIp(String maskedIp) {
        this.maskedIp = maskedIp;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public List<ServiceProvider> getServiceProviderList() {
        return serviceProviderList;
    }

    public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
