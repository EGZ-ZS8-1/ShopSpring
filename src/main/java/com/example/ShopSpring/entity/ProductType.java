package com.example.ShopSpring.entity;

import jakarta.persistence.Entity;

@Entity(name = "product_type")
public class ProductType {
    private Long id;
    private String name;

    public ProductType() {
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
}
