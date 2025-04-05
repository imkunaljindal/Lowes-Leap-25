package com.example.marvel_heroes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarvelRepository extends JpaRepository<Marvel,Integer> {
}
