package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Advertisement {
    @Id
    Long id;
    String name;
    String type;
    String description;

    @OneToMany(mappedBy = "advertisement")
    List<Gallery> galleries;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;
}
