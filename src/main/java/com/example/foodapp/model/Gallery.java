package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Gallery {
    @Id
    Long id;
    String type; // food or restaurant
    String category; // profile or thumbnails or logo
    String imageUrl;

    @ManyToOne
    @JoinColumn(name = "advertisement_id")
    Advertisement advertisement;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    Menu menu;

}
