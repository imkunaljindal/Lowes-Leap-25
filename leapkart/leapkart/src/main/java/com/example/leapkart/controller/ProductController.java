package com.example.leapkart.controller;

import com.example.leapkart.dto.request.ProductRequest;
import com.example.leapkart.dto.response.ProductResponse;
import com.example.leapkart.exception.SellerNotFoundException;
import com.example.leapkart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/seller/{seller-id}")
    public ResponseEntity addProduct(@PathVariable("seller-id") int sellerId,
                                       @RequestBody ProductRequest productRequest) {
        try{
            ProductResponse response = productService.addProduct(sellerId,productRequest);
            return new ResponseEntity(response, HttpStatus.FOUND);
        }
        catch (SellerNotFoundException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
