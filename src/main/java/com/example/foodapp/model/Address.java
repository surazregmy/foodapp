package com.example.foodapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    Long id;
    String addressLine1;
    String addressLine2;
    String city;
    String province;
    String country;
}
