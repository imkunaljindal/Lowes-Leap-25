package com.example.leapkart.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String flatNo;

    String city;

    int pincode;

    @OneToOne
    @JoinColumn
    @JsonBackReference
    Customer customer;
}
