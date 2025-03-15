package com.example.leapkart.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "address")
public class Address {

    @Id
    int id;

    String flatNo;

    String building;

    String locality;

    String city;

    int pincode;

    @OneToOne
    @JoinColumn
    Customer customer;
}
