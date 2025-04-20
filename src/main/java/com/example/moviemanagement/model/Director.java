package com.example.moviemanagement.model;
import jakarta.persistence.*;

@Entity
@Table(name="directors")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String bornYear;

    public Director(){}

    public Director(String name, String country, String bornYear) {
        this.name = name;
        this.country = country;
        this.bornYear = bornYear;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getBornYear() {
        return bornYear;
    }
    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }

}
