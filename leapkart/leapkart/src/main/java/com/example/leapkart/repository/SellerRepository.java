package com.example.leapkart.repository;

import com.example.leapkart.entity.Enum.Gender;
import com.example.leapkart.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Integer> {

    List<Seller> findByGender(Gender gender);
}
