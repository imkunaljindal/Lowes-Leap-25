package com.example.uniDirRelations.entity;

import com.example.uniDirRelations.entity.Enum.Gender;
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
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String email;

    Gender gender;

    String gstNo;

    @OneToMany
    @JoinColumn(name="seller_id")
    List<Product> productList;
}
