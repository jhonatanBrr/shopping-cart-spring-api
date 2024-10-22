package com.jhonatan.shopping_cart.repositories;

import com.jhonatan.shopping_cart.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
