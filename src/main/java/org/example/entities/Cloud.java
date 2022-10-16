package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

import java.util.List;

@Entity
@Table(name = "cloud")
public class Cloud implements Serializable {

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCloud;
    @Column(name = "brand",length = 45)
    private String brand;
    @Column(name = "name",length = 250)
    private String name;
    @Column(name = "year")
    private Integer year;
    @Column(name = "decription",length = 250)
    private String description;
    private Integer categoria;

    @ManyToOne
    @JoinColumn(name= "categoryId")
    @JsonIgnoreProperties("cloud")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "cloud")
    @JsonIgnoreProperties("cloud")
    public List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "cloud")
    @JsonIgnoreProperties("cloud")
    public List <Reservation> reservations;
    public Integer getIdCloud() {
        return idCloud;
    }

    public void setIdCloud(Integer idCloud) {
        this.idCloud = idCloud;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}