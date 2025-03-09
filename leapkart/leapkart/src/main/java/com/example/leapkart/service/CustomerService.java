package com.example.leapkart.service;

import com.example.leapkart.entity.Customer;
import com.example.leapkart.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isEmpty()) {
            throw new RuntimeException("Invalid customer Id");
        }

        return customerOptional.get();
    }

    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }
}
