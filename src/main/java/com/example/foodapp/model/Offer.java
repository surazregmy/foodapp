package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Offer {
    @Id
    Long id;
    String name;
    String description;

    @ManyToMany
    @JoinTable(
            name = "offer_menus"
    )
    List<Menu> menus;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    Restaurant restaurant;

    @ManyToMany(mappedBy = "offers")
    List<FoodOrder> orders;

}
