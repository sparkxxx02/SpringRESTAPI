package com.example.demo2;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Product {
    private Integer id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    @NonNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    @NonNull
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}