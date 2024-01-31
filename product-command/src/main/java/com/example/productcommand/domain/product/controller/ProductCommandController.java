package com.example.productcommand.domain.product.controller;

import com.example.productcommand.domain.product.domain.ProductCommandDto;
import com.example.productcommand.domain.product.service.ProductCommandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productList")
public class ProductCommandController {

    private final ProductCommandService productCommandService;

    @PostMapping
    public void addProduct(@RequestBody @Valid ProductCommandDto requestDto) {
        // ex Add Product Logic ...
        productCommandService.addProduct(requestDto);
    }

}
