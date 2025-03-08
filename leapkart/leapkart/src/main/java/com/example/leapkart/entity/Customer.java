package com.example.leapkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Customer {

    @Id     // primary key
    int id;

    String name;

    String email;

    int age;


    public Customer() {
    }

    public Customer(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
