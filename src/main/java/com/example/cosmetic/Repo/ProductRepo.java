package com.example.cosmetic.Repo;


import com.example.cosmetic.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product ORDER BY RANDOM() LIMIT 3", nativeQuery = true)
    List<Product> getThreeRandomData();
}
