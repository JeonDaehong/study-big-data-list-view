package com.example.productquery.domain.product.repository;

import com.example.productquery.domain.product.domain.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    Optional<Brand> findBrandById(Long id);

}
