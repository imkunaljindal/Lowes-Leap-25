package com.example.leapkart.dto.response;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ProductResponse {

    String name;

    int price;

    SellerResponse seller;
}
