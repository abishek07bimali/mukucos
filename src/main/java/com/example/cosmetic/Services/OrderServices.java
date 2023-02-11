package com.example.cosmetic.Services;

import com.example.cosmetic.Entity.Order;
import com.example.cosmetic.Entity.Product;
import com.example.cosmetic.Pojo.OrderPojo;

import java.util.List;

public interface OrderServices {
    OrderPojo save(OrderPojo orderPojo);
    List<Order> findOrderById(Integer id);

    List<Order> findAll();

    Order findById(Integer id);
    void deleteById(Integer id);
}
