package com.example.leapkart.convertor;

import com.example.leapkart.dto.request.ProductRequest;
import com.example.leapkart.dto.response.ProductResponse;
import com.example.leapkart.entity.Product;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductConvertor {

    public static Product productRequestToProduct(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .category(productRequest.getCategory())
                .availableQuantity(productRequest.getAvailableQuantity())
                .build();
    }

    public static ProductResponse productToProductResponse(Product product) {

        return ProductResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .seller(SellerConvertor.sellerToSellerResponse(product.getSeller()))
                .build();
    }
}
