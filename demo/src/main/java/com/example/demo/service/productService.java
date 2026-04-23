package com.example.demo.service;


import com.example.demo.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {
    private List<product> productList = new ArrayList<>();

    public String addProduct(product Product){
        return "Successfully add product";
    }


}
