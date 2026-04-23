package com.example.demo.controller;

import com.example.demo.service.productService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class productController {

    private final productService ProductService;

}
