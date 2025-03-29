package com.example.leapkart.repository;

import com.example.leapkart.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
