package com.springboot.ProductService.service;

import com.springboot.ProductService.model.ProductRequest;
import com.springboot.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
