package com.example.leapkart.convertor;

import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.entity.Customer;

public class CustomerConvertor {

    public static CustomerResponse customeToCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .email(customer.getEmail())
                .name(customer.getName())
                .build();
    }

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
        return Customer.builder()
                .age(customerRequest.getAge())
                .name(customerRequest.getName())
                .email(customerRequest.getEmail())
                .gender(customerRequest.getGender())
                .build();
    }
}
