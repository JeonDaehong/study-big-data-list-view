package com.example.productcommand.domain.product.service;

import com.example.productcommand.domain.product.domain.ProductCommandDto;
import com.example.productcommand.domain.product.repository.BrandRepository;
import com.example.productcommand.domain.product.repository.CategoryRepository;
import com.example.productcommand.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductCommandService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final BrandRepository brandRepository;

    /**
     * Product Add Service
     */
    @Transactional(readOnly = false)
    public void addProduct(ProductCommandDto requestDto) {
        // Add Product Logic ...
    }

}
