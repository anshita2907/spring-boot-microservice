package com.springboot.OrderService.service;

import com.springboot.OrderService.model.OrderRequest;
import com.springboot.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}