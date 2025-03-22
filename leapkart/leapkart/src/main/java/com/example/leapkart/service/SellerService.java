package com.example.leapkart.service;

import com.example.leapkart.convertor.SellerConvertor;
import com.example.leapkart.dto.request.SellerRequest;
import com.example.leapkart.dto.response.SellerResponse;
import com.example.leapkart.entity.Enum.Gender;
import com.example.leapkart.entity.Seller;
import com.example.leapkart.repository.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SellerService {

    private final SellerRepository sellerRepository;

    public String addSeller(SellerRequest sellerRequest) {
        //Step 1 -> sellerRepo.save(sellerRequest)
        Seller seller = SellerConvertor.sellerRequestToSeller(sellerRequest);
        sellerRepository.save(seller);
        return "Seller saved successfully";
    }

    public List<SellerResponse> getSellerByGender(Gender gender) {
        List<Seller> sellers = sellerRepository.findByGender(gender);

        List<SellerResponse> sellerResponses = new ArrayList<>();
        for(Seller seller: sellers) {
            sellerResponses.add(SellerConvertor.sellerToSellerResponse(seller));
        }
        return sellerResponses;
    }
}
