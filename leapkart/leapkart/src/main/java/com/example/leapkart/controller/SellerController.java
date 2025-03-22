package com.example.leapkart.controller;

import com.example.leapkart.dto.request.SellerRequest;
import com.example.leapkart.dto.response.SellerResponse;
import com.example.leapkart.entity.Enum.Gender;
import com.example.leapkart.entity.Seller;
import com.example.leapkart.service.SellerService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seller")
@RequiredArgsConstructor
public class SellerController {

    private final SellerService sellerService;

    @PostMapping
    public ResponseEntity<String> addSeller(@RequestBody SellerRequest sellerRequest) {
        String response = sellerService.addSeller(sellerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/gender/{gender}")
    public ResponseEntity<List<SellerResponse>> getSellerByGender(@PathVariable("gender") Gender gender) {
        List<SellerResponse> responseList = sellerService.getSellerByGender(gender);
        return new ResponseEntity<>(responseList,HttpStatus.OK);

    }
}
