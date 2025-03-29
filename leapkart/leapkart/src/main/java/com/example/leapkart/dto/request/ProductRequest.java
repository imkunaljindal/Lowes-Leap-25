package com.example.leapkart.dto.request;

import com.example.leapkart.entity.Enum.ProductCategory;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    String name;

    int price;

    ProductCategory category;

    int availableQuantity;
}
