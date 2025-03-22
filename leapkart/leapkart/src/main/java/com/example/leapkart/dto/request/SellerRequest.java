package com.example.leapkart.dto.request;

import com.example.leapkart.entity.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerRequest {

    String name;

    String email;

    Gender gender;

    String gstNo;
}
