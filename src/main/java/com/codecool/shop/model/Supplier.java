package com.codecool.shop.model;

import java.util.ArrayList;


public class Supplier extends BaseModel {

    private static int currentId = 0;

    private ArrayList<Product> products;

    public Supplier(String name, String description) {
        super(name);
        this.id = currentId;
        currentId++;
        this.products = new ArrayList<>();
        this.description = description;
    }
    public Supplier(int id, String name, String description) {
        this(name, description);
        this.id = id;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList getProducts() {
        return this.products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String toString() {
        return String.format("id: %1$d, " +
                        "name: %2$s, " +
                        "description: %3$s",
                this.id,
                this.name,
                this.description
        );
    }
}