package com.example.leapkart.controller;

import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.dto.response.SellerResponse;
import com.example.leapkart.entity.Customer;
import com.example.leapkart.entity.Enum.Gender;
import com.example.leapkart.repository.CustomerRepository;
import com.example.leapkart.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(CustomerController.class);

//
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

//    @Autowired
//    CustomerService customerService;  // field injection

    @Tag(name = "Customer", description = "API to add a customer")
    @PostMapping
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest) {
        logger.info("Received add customer request: "+customerRequest);
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
            logger.info("Received get customer request for id: "+id);
            CustomerResponse response = customerService.getCustomerById(id);
            return new ResponseEntity(response, HttpStatus.FOUND);
        } catch (Exception e) {
            logger.error("Not able to find customer for id: "+id);
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

    @GetMapping("/logs")
    public void getLogs() {
        logger.trace("This is a TRACE log");
        logger.debug("This is a DEBUG log");
        logger.info("This is a INFO log");
        logger.warn("This is a WARN log");
        logger.error("This is a ERROR log");
    }

}
