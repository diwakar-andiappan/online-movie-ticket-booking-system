package com.online.entity;

import com.online.request.ShowType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Movies")
public class MoviesDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @OneToMany(mappedBy = "movie")
    private long id;

    @Column(name = "movieName")
    private String name;

    @Column(name = "type")
    private ShowType type;

    @Column(name = "rating")
    private double rating;

    @Column(name = "genre")
    private List<String> genre;

    @Column(name = "language")
    private List<String> language;

    @Column(name = "format")
    private String format;

    @Column(name = "town")
    private List<String> town;

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

    public ShowType getType() {
        return type;
    }

    public void setType(ShowType type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<String> getTown() {
        return town;
    }

    public void setTown(List<String> town) {
        this.town = town;
    }
}
