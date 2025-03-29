package com.example.leapkart.entity;

import com.example.leapkart.entity.Enum.ProductCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "product")
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int price;

    @Enumerated(EnumType.STRING)
    ProductCategory category;

    int availableQuantity;

    @ManyToOne
    @JoinColumn
    Seller seller;

    @ManyToMany
    @JoinTable
    List<OrderEntity> orders;
}
