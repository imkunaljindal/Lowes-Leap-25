package com.example.leapkart.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressRequest {

    String flatNo;

    String city;

    int pincode;

}
