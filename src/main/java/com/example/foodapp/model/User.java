package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name = "users")
@Data
public class User {
    @Id
    Long id;
    String username;
    String email;
    String password;
    String firstName;
    String secondName;
    String role;
    @OneToOne
    Address address;
    @OneToMany(mappedBy = "user")
    List<Advertisement> advertisements;

    @OneToMany(mappedBy = "user")
    List<FoodOrder> orders;

}
