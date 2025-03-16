package com.example.leapkart.service;

import com.example.leapkart.convertor.CustomerConvertor;
import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.entity.Customer;
import com.example.leapkart.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer = CustomerConvertor.customerRequestToCustomer(customerRequest);
        Customer savedCustomer = customerRepository.save(customer);
        return CustomerConvertor.customeToCustomerResponse(savedCustomer);
    }

    public List<CustomerResponse> getAllCustomer() {
        List<Customer> customers = customerRepository.findAll();

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer: customers) {
            CustomerResponse response = CustomerConvertor.customeToCustomerResponse(customer);
            customerResponses.add(response);
        }
        return customerResponses;
    }

    public CustomerResponse getCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isEmpty()) {
            throw new RuntimeException("Invalid customer Id");
        }

        Customer savedCustomer = customerOptional.get();
        return CustomerConvertor.customeToCustomerResponse(savedCustomer);
    }

    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }
}
