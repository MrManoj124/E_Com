package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;

import java.lang.annotation.Documented;

//@Documented (collection = "products")
public class product {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public product(){}

    public int getId(){
        return id;
    }
    public void setId(int id){
         this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
