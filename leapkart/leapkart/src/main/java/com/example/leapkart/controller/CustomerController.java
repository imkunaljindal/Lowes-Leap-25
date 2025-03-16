package com.example.leapkart.controller;

import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.entity.Customer;
import com.example.leapkart.repository.CustomerRepository;
import com.example.leapkart.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor  // geenrates constructor for all the final fields of the class
public class CustomerController {

    private final CustomerService customerService;

//
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

//    @Autowired
//    CustomerService customerService;  // field injection

    @PostMapping
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest) {
        return customerService.addCustomer(customerRequest);
    }

    @GetMapping("/all")
    public List<CustomerResponse> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    // find a customer based on id
    @GetMapping("/id/{id}")
    public CustomerResponse getCustomerById(@PathVariable("id") int id) {
        return customerService.getCustomerById(id);
    }

    // empty your table
    @DeleteMapping("/all")
    public void deleteAllCustomer() {
        customerService.deleteAllCustomers();
    }

    // delete a customer based on id  //

}
