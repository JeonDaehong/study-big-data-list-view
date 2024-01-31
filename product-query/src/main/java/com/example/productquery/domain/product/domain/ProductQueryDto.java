package com.example.productquery.domain.product.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class ProductQueryDto {

    private final Long code;
    private final String message;
    private final Long nextToken;
    private List<ProductDataDto> dataList;

    public static ProductQueryDto toProductResponse(Long code, String message, Long nextToken, List<ProductDataDto> dataList) {
        return ProductQueryDto.builder()
                .code(code)
                .message(message)
                .nextToken(nextToken)
                .dataList(dataList)
                .build();
    }

}
