package com.example.leapkart.dto.request;

import com.example.leapkart.entity.Enum.Gender;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequest {

    String name;

    String email;

    int age;

    Gender gender;

    AddressRequest addressRequest;

//    @Override
//    public String toString() {
//        return "CustomerRequest{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
}
