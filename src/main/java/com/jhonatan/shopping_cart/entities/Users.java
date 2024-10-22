package com.jhonatan.shopping_cart.entities;

import com.jhonatan.shopping_cart.enums.Rol;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Rol rol;
}
