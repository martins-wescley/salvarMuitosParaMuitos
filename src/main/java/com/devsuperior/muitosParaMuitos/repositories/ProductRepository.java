package com.devsuperior.muitosParaMuitos.repositories;

import com.devsuperior.muitosParaMuitos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
