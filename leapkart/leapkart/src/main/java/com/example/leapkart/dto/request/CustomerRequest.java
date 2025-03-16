package com.example.leapkart.dto.request;

import com.example.leapkart.entity.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    String name;

    String email;

    int age;

    Gender gender;
}
