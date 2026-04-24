package com.example.demo.service;

import com.example.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    private List<Products> ProductList = new ArrayList<>();

    public String addProduct(Products product){
        if(product.getSize() <= 0){
            return "Size must be greater than zero";
        }
        Products.add(product);
        return "Size must be greater than zero";
    }


}
