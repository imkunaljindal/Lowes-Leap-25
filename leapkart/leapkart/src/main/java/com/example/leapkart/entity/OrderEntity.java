package com.example.leapkart.entity;

import com.example.leapkart.entity.Enum.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "order_entity")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String orderId;  // UUID

    long price;

    @CreationTimestamp
    Date createdAt;

    @UpdateTimestamp
    Date updatedAt;

    @Enumerated(EnumType.STRING)
    OrderStatus status;

    @ManyToMany(mappedBy = "orders")
    List<Product> products;

    @ManyToOne
    @JoinColumn
    Customer customer;


}
