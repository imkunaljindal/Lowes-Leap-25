package com.example.leapkart.controller;

import com.example.leapkart.entity.Customer;
import com.example.leapkart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public String addCustomer(@RequestBody Customer customer) {
        System.out.println(customer.getEmail());
        customerService.addCustomer(customer);
        return "Customer added successfully";
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    // find a customer based on id
    @GetMapping("/id/{id}")
    public Customer getCustomerById(@PathVariable("id") int id) {
        return customerService.getCustomerById(id);
    }

    // empty your table
    @DeleteMapping("/all")
    public void deleteAllCustomer() {
        customerService.deleteAllCustomers();
    }

    // delete a customer based on id  //

}
