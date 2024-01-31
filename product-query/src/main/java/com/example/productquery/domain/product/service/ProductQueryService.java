package com.example.productquery.domain.product.service;

import com.example.productquery.domain.product.domain.ProductDataDto;
import com.example.productquery.domain.product.domain.ProductQueryDto;
import com.example.productquery.domain.product.domain.entity.Brand;
import com.example.productquery.domain.product.domain.entity.Category;
import com.example.productquery.domain.product.domain.entity.Product;
import com.example.productquery.domain.product.repository.BrandRepository;
import com.example.productquery.domain.product.repository.CategoryRepository;
import com.example.productquery.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductQueryService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final BrandRepository brandRepository;

    @Transactional(readOnly = true)
    public ProductQueryDto getProductList(Integer lastProductId, Integer maxPerPage, String productName) {
        List<ProductDataDto> dataList = new ArrayList<>();
        List<Product> productList = productRepository.findProducts(productName, lastProductId, maxPerPage).orElseThrow();
        Long lastId = 0L;
        for ( Product product : productList ) {
            int i = 0;
            Category category = categoryRepository.findCategoryById(product.getCategoryId()).orElseThrow();
            Brand brand = brandRepository.findBrandById(product.getBrandId()).orElseThrow();
            ProductDataDto data = ProductDataDto.toProductDataResponse(product, brand, category);
            dataList.add(data);
            if ( i == productList.size() - 1) lastId = product.getId();
        }
        return ProductQueryDto.toProductResponse(200L, "Success", (lastId + 1), dataList);
    }

}
