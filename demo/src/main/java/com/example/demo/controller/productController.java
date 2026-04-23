package com.example.demo.controller;

import com.example.demo.model.product;
import com.example.demo.service.productService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    private final productService ProductService;

    public  productController(productService ProductService){
        this.ProductService=ProductService;
    }

    @PostMapping
    public String addProduct(@RequestBody product Product){
        return ProductService.addProduct(Product);
    }

    @GetMapping
    public List<product> getAllProduct(){
        return ProductService.getAllProduct();
    }

    @DeleteMapping("/{id}")

}
