package com.example.productcommand.domain.product.domain;

import com.example.productcommand.domain.product.domain.entity.Product.Status;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
public class ProductCommandDto {

    @NotNull
    @NotEmpty
    private final Integer nextPage; // 다음 페이지 ( 처음이면 1 )

    @NotNull
    @NotEmpty
    @Min(value = 10)
    @Max(value = 100)
    private final Integer maxPerPage; // 표시하고자 하는 건수 ( 최소 10, 최대 100 )

    @NotNull
    @NotEmpty
    private final Long categoryId; // 조회하고자 하는 상품의 카테고리 ID

    @NotNull
    @NotEmpty
    private final Status status; // 조회하고자 하는 상품의 상태

    private final String productName; // 조회하고자 하는 상품 명이 있는 경우 넣기 ( 없으면 공백 )

    private final LocalDateTime saleStartDateTime; // 해당 기간 이후 판매를 시작한 상품 불러오기

}
