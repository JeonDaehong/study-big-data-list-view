package com.example.productcommand.domain.product.repository;


import com.example.productcommand.domain.product.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
