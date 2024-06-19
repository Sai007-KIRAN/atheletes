package com.example.athletedirectory.model;

import javax.persistence.*;
import com.example.athletedirectory.model.*;
import java.util.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int countryId;

    @Column(name = "name")
    private String countryName;

    @Column(name = "flagimageurl")
    private String flagImageUrl;

    @Column(name = "athlete")
    private List<Athlete> athlete = new ArrayList<>();

    public Country() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlagImageUrl() {
        return flagImageUrl;
    }

    public void setFlagImageUrl(String flagImageUrl) {
        this.flagImageUrl = flagImageUrl;
    }

    public List<Athlete> getAthlete() {
        return athlete;
    }

    public void setAthlete(List<Athlete> athlete) {
        this.athlete = athlete;
    }
}