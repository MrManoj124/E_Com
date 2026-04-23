package com.example.demo.controller;

import com.example.demo.model.product;
import com.example.demo.service.productService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class productController {

    private final productService ProductService;

    public  productController(productService ProductService){
        this.ProductService=ProductService;
    }

    @PostMapping
    public String addProduct(@RequestBody product Product){
        return ProductService.addProduct(Product);
    }

}
