package com.devsuperior.muitosParaMuitos.repositories;

import com.devsuperior.muitosParaMuitos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
