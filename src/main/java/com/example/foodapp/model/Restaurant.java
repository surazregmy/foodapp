package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Restaurant {
    @Id
    Long id;
    String name;
    LocalDateTime openingHour;
    LocalDateTime closingHour;
    String contactNo;

    @OneToOne
    User user;
    @OneToOne
    Address address;
    @OneToMany(mappedBy = "restaurant")
    List<Gallery> images;
    @OneToMany(mappedBy = "restaurant")
    List<Menu> menus;


    @OneToMany(mappedBy = "restaurant")
    List<Offer> offers;
}
