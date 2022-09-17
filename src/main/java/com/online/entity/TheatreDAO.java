package com.online.entity;

import com.online.request.TheatreType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theatre")
public class TheatreDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @OneToMany(mappedBy = "theatre")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "locality")
    private String locality;

    @Column(name = "address")
    private String address;

    @Column(name = "type")
    private TheatreType type;

    @Column(name = "brand")
    private String brand;

    @Column(name = "facilities")
    private List<String> facilities;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TheatreType getType() {
        return type;
    }

    public void setType(TheatreType type) {
        this.type = type;
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
