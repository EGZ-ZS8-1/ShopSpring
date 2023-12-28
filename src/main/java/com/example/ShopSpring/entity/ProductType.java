package com.example.ShopSpring.entity;

import jakarta.persistence.Entity;

@Entity(name = "product_type")
public class ProductType {
    private Long id;
    private String name;

}
