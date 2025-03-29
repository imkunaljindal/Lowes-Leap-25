package com.example.leapkart.exception;

import com.example.leapkart.entity.Seller;

public class SellerNotFoundException extends RuntimeException {

    public SellerNotFoundException(String message) {
        super(message);
    }
}
