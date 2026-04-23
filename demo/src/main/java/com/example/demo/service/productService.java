package com.example.demo.service;


import com.example.demo.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {
    private final List<product> productList = new ArrayList<>();

    public String addProduct(product Product){
        return "Successfully add product";
    }

    public List<product> getAllProduct(){
        return productList;
    }

    public String deleteProduct(int id){
        for (product p : productList){
            if(p.getId() == id){
                productList.remove(p);
                return "Product deleted Successfully";
            }
        }
    }

}

