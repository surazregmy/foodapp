package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class FoodOrder {
    @Id
    Long id;
    BigDecimal totalCost;
    BigDecimal discount;
    BigDecimal netCost;


    @ManyToMany
    @JoinTable(
            name = "food_order_menus"
    )
    List<Menu> menus;

    @ManyToMany
    @JoinTable(
            name = "food_order_offers"
    )
    List<Offer> offers;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;
}
