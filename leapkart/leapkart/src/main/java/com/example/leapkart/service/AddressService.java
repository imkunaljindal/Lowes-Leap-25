package com.example.leapkart.service;

import com.example.leapkart.entity.Address;
import com.example.leapkart.repository.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepo addressRepo;

    public Address getAddress(int id) {
        return addressRepo.findById(id).get();
    }
}
