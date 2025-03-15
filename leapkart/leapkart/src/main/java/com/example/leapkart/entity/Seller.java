package com.example.leapkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "seller")
public class Seller {

    @Id
    int id;

    String name;

    String email;

    String gstNo;

    @OneToMany(mappedBy = "seller")
    List<Product> products;


}
