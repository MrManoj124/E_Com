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


}
