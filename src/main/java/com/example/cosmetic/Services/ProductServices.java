package com.example.cosmetic.Services;

import com.example.cosmetic.Entity.Product;
import com.example.cosmetic.Pojo.ProductPojo;

import java.util.*;
import java.io.IOException;

public interface ProductServices {
    ProductPojo save(ProductPojo productPojo) throws IOException;
    List<Product> findAll();
    List<Product> getThreeRandomData();

    Product findById(Integer id);
    void deleteById(Integer id);
}

