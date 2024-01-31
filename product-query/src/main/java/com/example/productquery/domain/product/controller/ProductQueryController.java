package com.example.productquery.domain.product.controller;

import com.example.productquery.domain.product.domain.ProductQueryDto;
import com.example.productquery.domain.product.service.ProductQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productList")
public class ProductQueryController {

    private final ProductQueryService productQueryService;

    @GetMapping
    public ResponseEntity<ProductQueryDto> getProductList(@RequestParam(value = "lastProductId") Integer lastProductId,
                                                          @RequestParam(value = "maxPerPage") Integer maxPerPage,
                                                          @RequestParam(value = "productName", defaultValue = "") String productName) {
        return ResponseEntity.status(HttpStatus.OK).body(productQueryService.getProductList(lastProductId, maxPerPage, productName));
    }

}
