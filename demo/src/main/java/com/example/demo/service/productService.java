package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

public class productService {
    private List<product> Product = new ArrayList<>();

    public String addProduct(product Product){
        return "Successfully add product";
    }
}
