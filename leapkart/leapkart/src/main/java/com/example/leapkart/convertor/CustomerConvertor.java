package com.example.leapkart.convertor;

import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.entity.Customer;

public class CustomerConvertor {

    public static CustomerResponse customeToCustomerResponse(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setName(customer.getName());
        return customerResponse;
    }

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setAge(customerRequest.getAge());
        customer.setGender(customerRequest.getGender());
        return customer;
    }
}
