package com.online.request;

import com.online.entity.TheatreDAO;
import com.online.request.TheatreType;

import java.util.List;

public class Theatre {
    private long id;
    private String name;
    private String town;
    private String locality;
    private TheatreType type;
    private String address;
    private String brand;
    private List<String> facilities;

    public Theatre(TheatreDAO theatreDAO){
        this.id=theatreDAO.getId();
        this.name= theatreDAO.getName();
        this.town= theatreDAO.getTown();
        this.locality= theatreDAO.getLocality();
        this.type=theatreDAO.getType();
        this.address= theatreDAO.getAddress();
        this.brand= theatreDAO.getBrand();
        this.facilities= theatreDAO.getFacilities();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public TheatreType getType() {
        return type;
    }

    public void setType(TheatreType type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

}
