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

    public List <Products> getAllProducts(){
        return ProductList;
    }

    public String deleteProduct(int id){
        for(Products p : ProductList){
            if(p.getId() == id){
                ProductList.remove(p);
                return  "Product deleted successfully";
            }
        }
        return "Product not found";
    }
}
