package com.example.leapkart.repository;

import com.example.leapkart.entity.Customer;
import com.example.leapkart.entity.Enum.Gender;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByGenderAndAgeGreaterThan(Gender gender, int age);
//
//    @Query(value = "select * from customers where gender=:g AND age>:a",nativeQuery = true)
//    List<Customer> getByGenderAndAgeGreaterThan(String g, int a);

    @Query(value = "select c from Customer c where c.gender=:g AND c.age>:a")
    List<Customer> getByGenderAndAgeGreaterThan(Gender g, int a);
}
