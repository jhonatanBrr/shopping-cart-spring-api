package com.jhonatan.shopping_cart.repositories;

import com.jhonatan.shopping_cart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
