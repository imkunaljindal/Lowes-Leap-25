package com.example.leapkart.entity;

import com.example.leapkart.entity.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.AnyDiscriminator;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "customers")
@Builder
public class Customer {

    @Id     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(name = "email_id",unique = true,nullable = false)
    String email;

    int age;

    @CreationTimestamp
    Date createdAt;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    Address address;


}
