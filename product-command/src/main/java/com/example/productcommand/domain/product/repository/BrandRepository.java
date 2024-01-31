package com.example.productcommand.domain.product.repository;

import com.example.productcommand.domain.product.domain.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
