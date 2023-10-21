package com.currency.currency_module.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AirportList {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "airPortNames")
private String airPortNames;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirPortNames() {
        return this.airPortNames;
    }

    public void setAirPortNames(String airPortNames) {
        this.airPortNames = airPortNames;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "airportList", cascade = CascadeType.ALL)
    private List<UserActivityManagement> userActivityManagementList;



    

}