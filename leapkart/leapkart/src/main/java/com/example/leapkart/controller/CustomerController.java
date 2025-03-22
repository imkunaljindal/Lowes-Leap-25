package com.example.leapkart.controller;

import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.dto.response.SellerResponse;
import com.example.leapkart.entity.Customer;
import com.example.leapkart.entity.Enum.Gender;
import com.example.leapkart.repository.CustomerRepository;
import com.example.leapkart.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity getCustomerById(@PathVariable("id") int id) {
        try {
            CustomerResponse response = customerService.getCustomerById(id);
            return new ResponseEntity(response, HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // empty your table
    @DeleteMapping("/all")
    public void deleteAllCustomer() {
        customerService.deleteAllCustomers();
    }

    // delete a customer based on id  //

    // get all customers of a particular gender and age greater than a particular age
    @GetMapping("/gender/{gender}/age/{age}")
    public List<CustomerResponse> getCustomerByGenderAndAgeGreaterThan(@PathVariable("gender") Gender gender,
                                                                       @PathVariable("age") int age) {
        return customerService.getCustomerByGenderAndAgeGreaterThan(gender,age);
    }

    @GetMapping("/query/gender/{gender}/age/{age}")
    public List<CustomerResponse> getCustomerByGenderAndAgeGreaterThanByQuery(@PathVariable("gender") Gender gender,
                                                                       @PathVariable("age") int age) {
        return customerService.getCustomerByGenderAndAgeGreaterThanByQuery(gender,age);
    }

}
