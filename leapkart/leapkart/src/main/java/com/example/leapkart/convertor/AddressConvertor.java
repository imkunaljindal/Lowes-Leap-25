package com.example.leapkart.convertor;

import com.example.leapkart.dto.request.AddressRequest;
import com.example.leapkart.entity.Address;

public class AddressConvertor {

    public static Address addressRequestToAddress(AddressRequest addressRequest) {
        return Address.builder()
                .flatNo(addressRequest.getFlatNo())
                .city(addressRequest.getCity())
                .pincode(addressRequest.getPincode())
                .build();
    }
}
