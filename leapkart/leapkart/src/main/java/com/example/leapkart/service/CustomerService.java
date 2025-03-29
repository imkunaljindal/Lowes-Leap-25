package com.example.leapkart.service;

import com.example.leapkart.convertor.AddressConvertor;
import com.example.leapkart.convertor.CustomerConvertor;
import com.example.leapkart.dto.request.CustomerRequest;
import com.example.leapkart.dto.response.CustomerResponse;
import com.example.leapkart.entity.Address;
import com.example.leapkart.entity.Customer;
import com.example.leapkart.entity.Enum.Gender;
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
        Address address = AddressConvertor.addressRequestToAddress(customerRequest.getAddressRequest());

        customer.setAddress(address);
        address.setCustomer(customer);

        Customer savedCustomer = customerRepository.save(customer);  // customer + address
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

    public Customer getCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isEmpty()) {
            throw new RuntimeException("Invalid customer Id");
        }

        Customer savedCustomer = customerOptional.get();
//        return CustomerConvertor.customeToCustomerResponse(savedCustomer);
        return savedCustomer;
    }

    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }

    public List<CustomerResponse> getCustomerByGenderAndAgeGreaterThan(Gender gender,
                                                                       int age) {
        List<Customer> customers = customerRepository.findByGenderAndAgeGreaterThan(gender,age);
        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer: customers) {
            CustomerResponse response = CustomerConvertor.customeToCustomerResponse(customer);
            customerResponses.add(response);
        }
        return customerResponses;
    }

    public List<CustomerResponse> getCustomerByGenderAndAgeGreaterThanByQuery(Gender gender,
                                                                              int age) {
        List<Customer> customers = customerRepository.getByGenderAndAgeGreaterThan(gender,age);
        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer: customers) {
            CustomerResponse response = CustomerConvertor.customeToCustomerResponse(customer);
            customerResponses.add(response);
        }
        return customerResponses;
    }
}
