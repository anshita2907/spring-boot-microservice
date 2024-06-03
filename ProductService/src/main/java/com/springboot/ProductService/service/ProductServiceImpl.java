package com.springboot.ProductService.service;

import com.springboot.ProductService.entity.Product;
import com.springboot.ProductService.exception.ProductServiceCustomException;
import com.springboot.ProductService.model.ProductRequest;
import com.springboot.ProductService.model.ProductResponse;
import com.springboot.ProductService.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.springframework.beans.BeanUtils.*;

@Service
public class ProductServiceImpl implements ProductService{

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {
        Product product=Product.builder().productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductServiceCustomException("Product with given id not found","PRODUCT_NOT_FOUND"));
        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(product, productResponse);
        return productResponse;
    }

    @Override
    public void reduceQuantity(long productId, long quantity) {
        log.info("Reduce Quantity {} for Id: {}", quantity,productId);
        Product product=productRepository.findById(productId).orElseThrow(()->new ProductServiceCustomException(
                "Product with given id not found", "PRODUCT_NOT_FOUND"
        ));
        if(product.getQuantity()<quantity){
            throw new ProductServiceCustomException(
                    "Product doesnt have sufficient quantity", "INSUFFICIENT_QUANTITY");
        }
        product.setQuantity(product.getQuantity()-quantity);
        productRepository.save(product);
        log.info("product Quantity Updated successfully");
    }
 }
