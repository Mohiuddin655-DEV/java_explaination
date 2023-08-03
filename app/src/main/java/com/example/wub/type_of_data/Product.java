package com.example.wub.type_of_data;

// User Defined Data Type
public class Product {

    String productName;
    double productPrice;
    int productDiscountByPercentage;

    public Product(String name, double price, int discount) {
        this.productName = name;
        this.productPrice = price;
        this.productDiscountByPercentage = discount;
    }
}
