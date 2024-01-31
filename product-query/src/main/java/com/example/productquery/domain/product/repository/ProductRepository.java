package com.example.productquery.domain.product.repository;

import com.example.productquery.domain.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query( value = "SELECT * FROM Product " +
            "WHERE PRODUCT_NM LIKE %:productName% " +
            "AND PRODUCT_ID < :lastProductId " +
            "ORDER BY PRODUCT_ID DESC " +
            "LIMIT :maxPerPage ", nativeQuery = true )
    Optional<List<Product>> findProducts(@Param("productName") String productName,
                                         @Param("lastProductId") Integer lastProductId,
                                         @Param("maxPerPage") Integer maxPerPage);

}
