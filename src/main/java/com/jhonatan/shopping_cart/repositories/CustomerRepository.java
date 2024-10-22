package com.jhonatan.shopping_cart.repositories;

import com.jhonatan.shopping_cart.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
