package com.example.uniDirRelations.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Customer {

    @Id     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(name = "email_id",unique = true,nullable = false)
    String email;

    int age;

    @OneToOne
    @JoinColumn
    Address address;
}
