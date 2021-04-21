package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    Long id;
    String name;
    String description;
    BigDecimal cost;

    @OneToMany(mappedBy = "menu")
    List<Gallery> images;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    Restaurant restaurant;

    @ManyToMany(mappedBy = "menus")
    List<Offer> offers;

    @ManyToMany(mappedBy = "menus")
    List<FoodOrder> orders; // TODO map manyToMany

}
