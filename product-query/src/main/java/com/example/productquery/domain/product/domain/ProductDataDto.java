package com.example.productquery.domain.product.domain;

import com.example.productquery.domain.product.domain.entity.Brand;
import com.example.productquery.domain.product.domain.entity.Category;
import com.example.productquery.domain.product.domain.entity.Product;
import com.example.productquery.domain.product.domain.entity.Product.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
public class ProductDataDto {

    private final Long productId;
    private final String productName;
    private final Long categoryId;
    private final String categoryName;
    private final Long brandId;
    private final String brandName;
    private final Double score;
    private final LocalDateTime saleStartDateTime;
    private final LocalDateTime saleEndDateTime;
    private final Status productStatus;
    private final LocalDateTime createDateTime;
    private final LocalDateTime updateDateTime;

    public static ProductDataDto toProductDataResponse(Product product, Brand brand, Category category) {
        return ProductDataDto.builder()
                .productId(product.getId())
                .productName(product.getName())
                .categoryId(category.getId())
                .categoryName(category.getName())
                .brandId(brand.getId())
                .brandName(brand.getName())
                .score(product.getScore())
                .saleStartDateTime(product.getSaleStartDateTime())
                .saleEndDateTime(product.getSaleEndDateTime())
                .productStatus(product.getStatus())
                .createDateTime(product.getCreateDateTime())
                .updateDateTime(product.getUpdateDateTime())
                .build();
    }

}
